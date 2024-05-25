package com.mcet.makautsuccesspath.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/*").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin((customizer) -> {customizer
                        .loginPage("/login").permitAll()
                        .defaultSuccessUrl("/home");
                })
                .logout((customizer) -> {customizer
                        .logoutUrl("/logout");
                });
        return http.build();
    }
}
