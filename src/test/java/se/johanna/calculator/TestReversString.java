package se.johanna.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.johanna.StringUtil;

public class TestReversString {
    @Test
    public void testReversString(){
        StringUtil testString = new StringUtil();
        String test = testString.revers("hello");
        Assertions.assertEquals("olleh", test);
    }
}
