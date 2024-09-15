package dev.ducku.apiconsumer.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@RestController
@RefreshScope
public class InsuranceController {

    private final RestTemplate restTemplate;
    @Value("${api.provider.url}")
    private String url;

    public InsuranceController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/plans")
    public List<String> getAllPlans() {
        List result = restTemplate.getForObject(url, List.class);
        return result.stream().map(plan -> "Option: " + plan).toList();
    }
}
