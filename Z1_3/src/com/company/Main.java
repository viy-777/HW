package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double ZP;
        int tax = 13;
        double ZP_;

        System.out.println("Введите размер зарплаты:");
        Scanner in = new Scanner(System.in);
        ZP = in.nextDouble();

        ZP_ = ZP-ZP*tax/100;
        System.out.println("Зарплата за вычетом налога: "+ ZP_+" руб.");
    }
}

