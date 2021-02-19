package se.johanna.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.johanna.Divide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTest {
    @Test
    public void calculationTestOne(){
        Assertions.assertEquals(5, Divide.calculate(10, 2));
    }
    @Test
    public void calculationTestTwo(){
        assertEquals(2.5, Divide.calculate(5, 2));
    }
}
