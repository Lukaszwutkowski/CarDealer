package com.xyz.model;

public class Customer extends Person{

    private int customerId;

    public Customer(String firstName, String lastName, Address address, String phoneNumber, String email, int customerId) {
        super(firstName, lastName, address, phoneNumber, email);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
