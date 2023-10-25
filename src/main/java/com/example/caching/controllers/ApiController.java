package com.example.caching.controllers;

import com.example.caching.services.ApiService;
import com.example.caching.services.FeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api")
public class ApiController {

    private final ApiService apiService;

    @GetMapping(value = "{seconds}")
    public ResponseEntity<String> getResponse(@PathVariable Integer seconds) {
        return ResponseEntity.ok(apiService.getResponse(seconds));
    }
}
