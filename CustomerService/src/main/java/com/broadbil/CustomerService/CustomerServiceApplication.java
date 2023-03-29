package com.broadbil.CustomerService;

import com.broadbil.CustomerService.model.Customer;
import com.broadbil.CustomerService.service.CustomerService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerService customerService) {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Customer>> typeReference = new TypeReference<List<Customer>>() {};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/customer.json");
            try {
                List<Customer> customers = mapper.readValue(inputStream, typeReference);
                customerService.saveCustomers(customers);
                System.out.println("Customers Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Customers: " + e.getMessage());
            }
        };
    }
}
