package com.healthcar.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrmController {

    @GetMapping("/test")
    public String test() {
        return "test controller response";
    }
}
