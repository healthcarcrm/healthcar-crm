package com.healthcar.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Base controller of the app.
 */
@RestController
public class CrmController {

    /**
     * Test method.
     *
     * @return string for test info
     */
    @GetMapping("/test")
    public String test() {
        return "test controller response";
    }
}
