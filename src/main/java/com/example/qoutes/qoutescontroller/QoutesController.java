package com.example.qoutes.qoutescontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QoutesController {

    @GetMapping("/qoutes")
    public String getQoutes(){
        return "Created";
    }
}
