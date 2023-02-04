package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {

        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    result++;
                }
            }
        }
        return result;
    }
}
    