package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVoidMethodThrowsException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Mock Exception"))
                .when(mockApi)
                .execute();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.performAction();
        });

        verify(mockApi).execute();
    }
}