package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculate(String testName, long leftBorder, long rightBorder, long expected) {
        SQRService service = new SQRService();

        long actual = service.calculate(leftBorder, rightBorder);
        assertEquals(expected, actual);
    }
}
