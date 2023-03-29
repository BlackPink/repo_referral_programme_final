package com.broadbil.CustomerService.service;

import com.broadbil.CustomerService.model.Customer;
import com.broadbil.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    public Iterable<Customer> saveCustomers(List<Customer> customers) {
        customerRepository.saveAll(customers);
        return customers;
    }
}
