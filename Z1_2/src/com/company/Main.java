package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double cost;
        int quantity;
        double sum;

        System.out.println("Введите стоимость 1 л топлива:");
        Scanner in = new Scanner(System.in);
        cost = in.nextDouble();

        System.out.println("Введите количество л топлива:");
        quantity = in.nextInt();

        sum = cost*quantity;
        System.out.println("Стоимость топлива: "+ sum+" руб.");
    }
}

