package se.johanna.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.johanna.Subtract;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractTest {
    @Test
    public void calculateTestOne(){
        Assertions.assertEquals(8, Subtract.calculate(10,2));
    }

    @Test
    public void calculateTestTwo(){
        assertEquals(-2, Subtract.calculate(-1,1));
    }

    @Test
    public void calculateTestTree(){
        assertEquals(0, Subtract.calculate(-1,-1));
    }
}
