package com.adp.demo.controller;

import com.adp.demo.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/myATM/demo")
public class ATMController {

    @Autowired
    private ATMService service;

    @GetMapping(value="/helloworld", produces="application/json")
    public ResponseEntity helloWorld()
    {
        return ResponseEntity.status(HttpStatus.OK).body("Hello world");
    }

    @GetMapping(value="/getChange", produces="application/json")
    @ResponseBody
    public ResponseEntity getChange(@RequestParam int bill)
    {
        return ResponseEntity.status(HttpStatus.OK).body(service.getChange(bill));
    }

}
