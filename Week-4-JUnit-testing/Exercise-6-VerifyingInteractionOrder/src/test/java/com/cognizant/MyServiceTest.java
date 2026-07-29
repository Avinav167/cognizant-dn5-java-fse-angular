package com.cognizant;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testInteractionOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.executeProcess();

        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).connect();
        inOrder.verify(mockApi).disconnect();
    }
}