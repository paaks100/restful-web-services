/*
package com.paaks.rest.webservices.restful_web_services.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // All requests should be authenticated
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

        // If a request is not authenticated, a web page is shown
        http.httpBasic(withDefaults());

        // CSRF -> POST, PUT
        http.csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }
}
*/
