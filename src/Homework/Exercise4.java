package Homework;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Part 3.5.1");

        int x =3;
        int y =2;
        if (x>2) {
            if (y > 2) {
                int z = x + y;
                System.out.println("z is " + z);
            }
        }
        else
            System.out.println("x is " + x);


        int x1 =3;
        int y1 =4;
        if (x1>2) {
            if (y1 > 2) {
                int z1 = x1 + y1;
                System.out.println("z1 is " + z1);

            }
        }
        else
            System.out.println("x1 is " + x1);


        int x2 =2;
        int y2 =2;
        if (x2>2) {
            if (y2 > 2) {
                int z2 = x2 + y2;
                System.out.println("z2 is " + z2);
            }
        }
        else
            System.out.println("x2 is " + x2);


        System.out.println("Part 3.5.2");

        int x3 =2;
        int y3 =3;
        if (x3>2)
            if (y3 > 2) {
                int z3 = x3 + y3;
                System.out.println("z3 is " + z3);
            }
            else
                System.out.println("x3 is " + x3);


        int x4 =3;
        int y4 =2;
        if (x4>2)
            if (y4 > 2) {
                int z4 = x4 + y4;
                System.out.println("z4 is " + z4);
            }
            else
                System.out.println("x4 is " + x4);


        int x5 =3;
        int y5 =3;
        if (x5>2)
            if (y5 > 2) {
                int z5 = x5 + y5;
                System.out.println("z5 is " + z5);
            }
            else
                System.out.println("x5 is " + x5);


        System.out.println("Part 3.5.3");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите оценку:");
        double score = input.nextDouble();
        if (score>=60)
            System.out.println("D");
        else if (score>=70)
            System.out.println("C");
        else if (score>=80)
            System.out.println("B");
        else if (score>=90)
            System.out.println("A");
        else
            System.out.println("F");
        // Забыли  добавить сканер и задать какое-нибуть число или задать уже определеное число

    }
}
