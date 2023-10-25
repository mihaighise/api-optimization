package com.example.caching.services;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiService {

    private final FeignClient feignClient;

    @Cacheable(value = "response", key = "#root.methodName")
    public String getResponse(Integer seconds) {
        return feignClient.getResponse(seconds);
    }
}
