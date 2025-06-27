package com.example;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DataServiceTest {

    @Test
    public void testVerifyInteraction() {
        DataProvider mockProvider = mock(DataProvider.class);
        DataService service = new DataService(mockProvider);
        service.retrieve();
        verify(mockProvider).getValue();
    }
}
