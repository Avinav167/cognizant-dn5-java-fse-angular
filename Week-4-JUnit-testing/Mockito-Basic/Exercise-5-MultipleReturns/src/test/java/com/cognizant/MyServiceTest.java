package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testMultipleReturns() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        MyService service = new MyService(mockApi);

        String firstResult = service.fetchData();
        String secondResult = service.fetchData();

        assertEquals("First Mock Data", firstResult);
        assertEquals("Second Mock Data", secondResult);
    }
}