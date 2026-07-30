package com.cognizant;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {

        UserRepository mockRepository = mock(UserRepository.class);

        User user = new User(1L, "Abhinav");

        when(mockRepository.findById(1L))
                .thenReturn(Optional.of(user));

        UserService service = new UserService(mockRepository);

        User result = service.getUserById(1L);

        assertNotNull(result);
        assertEquals("Abhinav", result.getName());
        assertEquals(1L, result.getId());
    }
}