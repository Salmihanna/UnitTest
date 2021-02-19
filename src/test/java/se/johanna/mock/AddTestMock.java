package se.johanna.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import se.johanna.Add;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AddTestMock {
    @Mock private Add calculateMock;
    @BeforeEach
    public void serUp(){
        when(calculateMock.calculate(anyInt(), anyInt())).thenReturn(10);
    }
    @Test
    public void calculateTestMock(){
        Assertions.assertEquals(10, calculateMock.calculate(10,2));
    }
}
