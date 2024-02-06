package com.kiran.BankAppService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoansController {
    @GetMapping("/myLoans")
    public ResponseEntity<String> getLoansDetails(){
        return new ResponseEntity<>("Loans Details...", HttpStatus.OK);
    }
}
