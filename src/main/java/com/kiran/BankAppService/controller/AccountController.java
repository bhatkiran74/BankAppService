package com.kiran.BankAppService.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    @GetMapping("/myAccount")
    public ResponseEntity<String> getAccountDetails() {
        return new ResponseEntity<>("Account Details...", HttpStatus.OK);
    }

    @GetMapping("/accountDetails")
    public ResponseEntity<String> getAccount(){
      return new ResponseEntity<>("Account information page",HttpStatus.OK);
    }
}
