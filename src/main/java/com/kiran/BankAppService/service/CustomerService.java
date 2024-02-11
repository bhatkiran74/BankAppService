package com.kiran.BankAppService.service;

import com.kiran.BankAppService.model.CustomerRequest;
import com.kiran.BankAppService.model.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    CustomerResponse registerUser(CustomerRequest customerRequest);
}
