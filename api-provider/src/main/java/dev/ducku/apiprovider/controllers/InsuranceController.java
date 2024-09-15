package dev.ducku.apiprovider.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceController {

    @GetMapping("/plans")
    public List<String> getAllPlans() {
        return List.of("Premium", "Gold", "Platinum", "Silver", "Titanium");
    }
}
