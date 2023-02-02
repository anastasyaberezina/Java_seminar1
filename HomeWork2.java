package lesson1;

import java.util.Scanner;

public class HomeWork2 {
    public static Integer main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberyear = scan.nextInt();
        leapYear(numberyear);
    }

    public static boolean leapYear(int numberyear) {
        if (numberyear % 400 == 0) {
            return true;
        }
        if (numberyear % 100 == 0) {
            return false;
        }
        System.out.println(leapYear(numberyear));
    }
}
