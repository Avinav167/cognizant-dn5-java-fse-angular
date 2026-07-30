package com.cognizant;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testUserNotFound() {

        UserRepository repository = mock(UserRepository.class);

        when(repository.findById(1L))
                .thenReturn(Optional.empty());

        UserService service = new UserService(repository);

        assertThrows(NoSuchElementException.class,
                () -> service.getUserById(1L));
    }
}