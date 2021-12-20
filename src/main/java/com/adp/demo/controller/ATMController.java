package com.adp.demo.controller;

import com.adp.demo.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "/v1/myATM/demo")
public class ATMController {

    @Autowired
    private ATMService service;

    @GetMapping(value="/helloworld")
    public ResponseEntity helloWorld()
    {
        return ResponseEntity.status(HttpStatus.OK).body("Hello world");
    }

}
