package com.cognizant;

import java.util.NoSuchElementException;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User getUserById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NoSuchElementException("User not found"));

    }
}