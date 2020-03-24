package ru.baranov;

import java.util.Random;                                                  //подклюение библиотеки
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;                                                     //минимум
        int max = 100;                                                   //максимум
        int diff = max - min;                                            //диапазон
        Random random = new Random();                                   //инициализация рандома
        int i = random.nextInt(diff + 1);                        // генерирация целого числа, включая max
        i += min;

        System.out.println("Случайное число в диапазоне 0..100: " + i);

        int numm;
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        numm = in.nextInt();

        int a = 3;
        int b = 4;
        int c = a + b;
    }
}
