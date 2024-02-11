package com.kiran.BankAppService.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerResponse {
    private int id;
    private String email;
    private String pwd;
    private String role;
}
