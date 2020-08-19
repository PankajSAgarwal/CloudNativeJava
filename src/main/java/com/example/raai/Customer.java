package com.example.raai;

public class Customer {
    private final Long id;
    private final String email;

    public Customer(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
