package com.cognizant;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    void testFindByName() {

        repository.save(new User(1L, "Abhinav"));
        repository.save(new User(2L, "Rahul"));

        List<User> users = repository.findByName("Abhinav");

        assertEquals(1, users.size());
        assertEquals("Abhinav", users.get(0).getName());
    }
}