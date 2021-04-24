package com.example.jpa.demojpa.web;

import com.example.jpa.demojpa.model.Table1;
import com.example.jpa.demojpa.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApi {

    private final SampleService sampleService;

    public WebApi(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    @GetMapping("/")
    public Table1 saveSampleEntry(){
        return sampleService.saveEntry(null);
    }

}
