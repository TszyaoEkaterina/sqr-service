package ru.netology.sqr;

public class SQRService {

    public long calculate(long leftBorder, long rightBorder) {
        int i = 0;
        for (int number = 10; number < 100; number++) {
            if (number * number <= rightBorder && number * number >= leftBorder) {
                    i = i + 1;
            }
        }
        return i;

    }

}
