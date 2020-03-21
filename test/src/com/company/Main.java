package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double sec;
        double hour;

        System.out.println("Введите количество секунд:");
        Scanner in = new Scanner(System.in);
        sec = in.nextDouble();

        hour = sec/3600;
        System.out.println("Количество часов: "+ hour+" ч.");
    }
}
