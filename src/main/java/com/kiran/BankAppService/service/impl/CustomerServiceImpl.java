package com.kiran.BankAppService.service.impl;

import com.kiran.BankAppService.entity.Customer;
import com.kiran.BankAppService.model.CustomerRequest;
import com.kiran.BankAppService.model.CustomerResponse;
import com.kiran.BankAppService.repository.CustomerRepository;
import com.kiran.BankAppService.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Registers a new user based on the provided customer request.
     *
     * @param request The customer request containing necessary information for user registration.
     * @return A CustomerResponse object representing the registered user's details.
     * This method maps the customer request to a Customer entity, saves it using the customerRepository,
     * and then maps the saved Customer entity to a CustomerResponse DTO (Data Transfer Object) for the response.
     */
    @Override
    public CustomerResponse registerUser(CustomerRequest request) {
        Customer customer = mapToCustomerEntity(request);
        Customer savedCustomer = customerRepository.save(customer);
        return mapToCustomerResponseDto(savedCustomer);
    }

    private CustomerResponse mapToCustomerResponseDto(Customer savedCustomer) {
        return CustomerResponse.builder()
                .id(savedCustomer.getId())
                .email(savedCustomer.getEmail())
                .pwd(savedCustomer.getPwd())
                .role(savedCustomer.getRole())
                .build();
    }

    private Customer mapToCustomerEntity(CustomerRequest customerRequest) {
        return Customer.builder()
                .email(customerRequest.getEmail())
                .pwd(customerRequest.getPwd())
                .role(customerRequest.getRole())
                .build();
    }
}
