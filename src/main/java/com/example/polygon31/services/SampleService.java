package com.example.polygon31.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SampleService {

    public LocalDateTime getDate(){
        return LocalDateTime.now();
    }
}
