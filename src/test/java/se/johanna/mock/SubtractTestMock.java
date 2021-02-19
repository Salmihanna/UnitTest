package se.johanna.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.Spy;
import se.johanna.Subtract;

import static org.mockito.ArgumentMatchers.anyInt;

public class SubtractTestMock {
    @Spy private Subtract classStatic = new Subtract();

    @Test
    public void testStaticMethodMock(){
        try(MockedStatic<Subtract> mockedStatic = Mockito.mockStatic(Subtract.class)){
            mockedStatic.when(() -> Subtract.calculate(anyInt(), anyInt())).thenReturn(10);
            Assertions.assertEquals(12, Subtract.calculate(10,3));
        }
    }
}
