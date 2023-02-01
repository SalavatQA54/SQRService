package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SQRServiceTest {

    @Test
    public void SqrQtyCorrectCountTest() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void SqrQtyIncorrectCountTest() {
        SQRService service = new SQRService();

        int actual = service.calculate(0, 300);
        int expected = 3;

        assertNotEquals(expected, actual);
    }

    @Test
    public void SqrQtyRangeErrorTest() {
        SQRService service = new SQRService();

        int actual = service.calculate(300, 200);
        int expected = 0;

        assertEquals(expected, actual);
    }
}