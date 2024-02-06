package com.kiran.BankAppService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi")
public class CardsController {
    @GetMapping("/myCards")
    public ResponseEntity<String> getCardsDetails(){
        return new ResponseEntity<>("Cards Details...", HttpStatus.OK);
    }
}
