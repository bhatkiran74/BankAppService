package com.kiran.BankAppService.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequest {
    private String email;
    private String pwd;
    private String role;
}
