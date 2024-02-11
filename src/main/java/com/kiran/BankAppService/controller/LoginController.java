package com.kiran.BankAppService.controller;

import com.kiran.BankAppService.model.CustomerRequest;
import com.kiran.BankAppService.model.CustomerResponse;
import com.kiran.BankAppService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @Autowired
    private CustomerService customerService;

    /**
     * Endpoint for handling user registration requests.
     * @param customerRequest The request body containing necessary information for user registration.
     * @return ResponseEntity containing the registered user's details in CustomerResponse format.
     * This method delegates the registration process to the customerService,
     * retrieves the response, and returns it with an HTTP OK status.
     */
    @PostMapping("/register")
    ResponseEntity<CustomerResponse> registerUser(@RequestBody CustomerRequest customerRequest){
        CustomerResponse customerResponse = customerService.registerUser(customerRequest);
        return new ResponseEntity<>(customerResponse, HttpStatus.OK);
    }
}
