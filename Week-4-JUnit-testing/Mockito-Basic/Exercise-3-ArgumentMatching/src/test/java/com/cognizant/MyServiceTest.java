package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData("Hello Mockito");

        verify(mockApi).sendData(anyString());
    }
}