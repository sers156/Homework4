package Homework;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Part 3.4.1");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите оценку:");
        double score = input.nextDouble();
        int pay = 500;
        if (score>90)
            pay *=1.03;
        else
            pay *=1.01;
        System.out.println(pay);

        System.out.println("Part 3.4.2");

        int number = 30;
        if (number % 2 ==0)
            System.out.println(number + " is even");
        System.out.println(number + " is odd");

        int number1 = 35;
        if (number1 % 2 ==0)
            System.out.println(number1 + " is even");
        System.out.println(number1 + " is odd");

        int number2 = 30;
        if (number2 % 2 ==0)
            System.out.println(number2 + " is even");
        else
            System.out.println(number2 + " is odd");

        int number3 = 35;
        if (number3 % 2 ==0)
            System.out.println(number3 + " is even");
        else
            System.out.println(number3 + " is odd");

    }
}
