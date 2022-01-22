package com.minejava.customer.service;

import com.minejava.customer.model.Customer;
import com.minejava.customer.request.CustomerRegistrationRequest;

import org.springframework.stereotype.Service;


public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest  request) {

        Customer customer = Customer.builder()
        .firstName(request.firstName())
        .lastName(request.lastName())
        .email(request.email())
        .build();
        // todo: check if email is valid
    //todo: check if email is not taken
    // todo: check if customer is in db
    }
}
