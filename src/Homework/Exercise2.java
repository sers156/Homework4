package Homework;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Part 3.3.1");

        int x=0;
        int y=5;
        if  (y>0) x=1;
        System.out.println(x);

        System.out.println("Part 3.3.2");

        int pay = 500;
        int score = 0;
        if (score>90);
        pay *=1.03;
        System.out.println(pay);

        System.out.println("Part 3.3.3");

        Scanner input = new Scanner(System.in);
        final double PI =3.141592;
        System.out.println("Введите радиус:");
        double radius = input.nextDouble();
        if (radius >= 0)
        {
            double area = radius *radius * PI;
            System.out.println("The area for the circle of " + "radius " + radius + " is " + area);
        }
        // Забыли задать число PI которое не изменяется
        // Забыли  добавить сканер и задать какое-нибуть число или задать уже определеное число радиусу, которое равно или больше 0
        // Забыли добавить скобки в if  (radius >=0) чтобы продолжилась выполнение задачи
        // Забыли задать тип данных doudle или другой любой тип данных  чтобы началось решаться выражение

    }
}
