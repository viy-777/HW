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

        int N = 0;                                    //ввод пользователем числа
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        boolean gameover = true;

        while (gameover == true) {
            int dif = Math.abs((i - N));
            if (N == i) {System.out.println("Вы угадали число!");
                         gameover = false;
                         break;}
        else
            {
                if (dif <= 5) {System.out.println("Горячо! Введите число:");
                               N = in.nextInt();}
                if (dif > 5) {System.out.println("Холодно! Введите число:");
                              N = in.nextInt();}
            }
        }
    }
}
