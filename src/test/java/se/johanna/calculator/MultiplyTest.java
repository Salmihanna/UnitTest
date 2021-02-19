package se.johanna.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.johanna.Multiply;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {
    @Test
    public void calculateTestOne(){
        Assertions.assertEquals(20, Multiply.calculate(10, 2));
    }

    @Test
    public void calculateTestTwo(){
        assertEquals(-5, Multiply.calculate(-1, 5));
    }

    @Test
    public void calculateTestTree(){
        assertEquals(0, Multiply.calculate(0, 5));
    }
}
