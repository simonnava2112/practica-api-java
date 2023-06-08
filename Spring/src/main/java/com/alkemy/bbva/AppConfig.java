package com.alkemy.bbva;

import com.alkemy.bbva.services.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("employeeService")
    public EmployeeService service() {
        return new EmployeeService();
    }
}
