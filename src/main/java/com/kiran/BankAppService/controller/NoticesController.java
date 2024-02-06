package com.kiran.BankAppService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi")
public class NoticesController {
    @GetMapping("/notices")
    public ResponseEntity<String> getNoticesDetails(){
        return new ResponseEntity<>("Notices Details...", HttpStatus.OK);
    }
}
