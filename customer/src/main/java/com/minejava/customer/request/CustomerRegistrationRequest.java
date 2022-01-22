package com.minejava.customer.request;

public record CustomerRegistrationRequest( 
    String firstName, 
    String lastName, 
    String email
) {
    
}
