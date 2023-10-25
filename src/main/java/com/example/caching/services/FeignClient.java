package com.example.caching.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name = "myClient", url = "https://hub.dummyapis.com")
public interface FeignClient {

    @GetMapping("/delay")
    String getResponse(@RequestParam Integer seconds);
}
