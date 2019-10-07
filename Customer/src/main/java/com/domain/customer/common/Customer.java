package com.domain.customer.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    private String key;

    private String firstName;

    private String lastName;

    public Customer(){

    }

    public Customer(String key, String firstName, String lastName){
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
