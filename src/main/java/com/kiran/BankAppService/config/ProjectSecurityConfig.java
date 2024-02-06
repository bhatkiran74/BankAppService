package com.kiran.BankAppService.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(authorize ->
                        authorize
                                .requestMatchers("/api/v1/myAccount","/api/vi/myBalance","/api/vi/myCards","/api/vi/myLoans").authenticated()
                                .requestMatchers("/api/v1/contact","/api/vi/notices").permitAll()
                                .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }


    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        /* Approach 1 */
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("kiran")
//                .password("kiran123")
//                .authorities("USER")
//                .build();
//
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin123")
//                .authorities("ADMIN")
//                .build();

        /* Approach 2 */
        UserDetails user = User.withUsername("kiran")
                .password("kiran123")
                .authorities("USER")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password("admin123")
                .authorities("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user,admin);
    }
    /* Approach 2 */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
