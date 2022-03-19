package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"range under10*10,0,99,0",
            "range from 200 to 300,200,300,3",
            "range from 400 to 500,400,500,3",
            "range over99*99,9802,10000,0"})
    void shouldCalculate(String testName, long leftBorder, long rightBorder, long expected) {
        SQRService service = new SQRService();

        long actual = service.calculate(leftBorder, rightBorder);
        assertEquals(expected, actual);
    }
}
