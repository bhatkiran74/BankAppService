package com.kiran.BankAppService.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//        /* Access Denid for all */
        http.authorizeHttpRequests(authorize -> authorize.anyRequest().denyAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
//        /* Access granted for all */
//        http.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll())
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());

//        http.authorizeHttpRequests(authorize ->
//                        authorize
//                                .requestMatchers("/api/v1/myAccount","/api/vi/myBalance","/api/vi/myCards","/api/vi/myLoans").authenticated()
//                                .requestMatchers("/api/v1/contact","/api/vi/notices").permitAll()
//                                .anyRequest().authenticated()
//                )
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}
