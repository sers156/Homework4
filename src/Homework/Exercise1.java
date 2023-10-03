package Homework;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Part 3.2.1");
        System.out.println(" >,<,>=,<=,==,!=");

        System.out.println("Part 3.2.2");

        int x=1;
        boolean b1= x>0;
        System.out.println(b1);
        boolean b2= x<0;
        System.out.println(b2);
        boolean b3= x!=0;
        System.out.println(b3);
        boolean b4= x>=0;
        System.out.println(b4);
        boolean b5= x!=1;
        System.out.println(b5);
        System.out.println("Part 3.2.3");

        boolean b = true;
        int i = (boolean) b;
        int i =1;
        boolean b = (int)i;
        // тип данных boolean не может быть переделан в другой тип данных

    }
}
