package ru.netology.sqr.square54.services;

public class SQRService {
    public int calcSQR(int min, int max) {

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
    