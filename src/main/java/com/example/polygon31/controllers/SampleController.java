package com.example.polygon31.controllers;

import com.example.polygon31.services.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class SampleController {

    public final SampleService sampleService;

    @GetMapping("/api/info")
    public Map<String, Object> getInfo(){
        return Map.of("serverTime", sampleService.getDate());
    }
}
