package com.kiran.BankAppService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BalanceController {
    @GetMapping("/myBalance")
    public ResponseEntity<String> getBalanceDetails(){
        return new ResponseEntity<>("Balance Details...", HttpStatus.OK);
    }
}
