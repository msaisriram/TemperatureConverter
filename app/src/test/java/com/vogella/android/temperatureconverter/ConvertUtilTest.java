package com.vogella.android.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConvertUtilTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        float actual=ConverterUtil.convertFahrenheitToCelsius(100);
        float expected = 37.778f;
        assertEquals("Conversion from fahrenheit to celsius failed", expected, actual, 0.001);
    }

    public void testConvertCelsiusToFahrenheit() {
        float actual=ConverterUtil.convertCelsiusToFahrenheit(100);
        float expected=212;
        assertEquals("Conversion from fahrenheit to celsius failed", expected, actual, 0.1);
    }
}