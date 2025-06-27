package com.example;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class DataServiceTest {

    @Test
    public void testVerifyInteraction() {
        DataProvider mockProvider = mock(DataProvider.class);
        DataService service = new DataService(mockProvider);
        service.retrieve();
        verify(mockProvider).getValue();
    }
}
