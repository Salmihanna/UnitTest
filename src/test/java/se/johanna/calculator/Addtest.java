package se.johanna.calculator;

import org.junit.jupiter.api.Test;
import se.johanna.Add;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Addtest {
    private Add testCalculateMethod = new Add();
    @Test
    public void testCalculateOne(){
        assertEquals(12, testCalculateMethod.calculate(10, 2));
    }
    @Test
    public void testCalculateTwo(){
        assertEquals(0, testCalculateMethod.calculate(-5, 5));
    }
    @Test
    public void testCalculateTree(){
        assertEquals(-2, testCalculateMethod.calculate(6, -8));
    }
}
