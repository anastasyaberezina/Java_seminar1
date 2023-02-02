package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ex2();
    }

   /* private static void ex1() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello, %s!", name);
        scan.close();
    }*/


    public static void ex2() {
        int[] arr = new int[]{1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
        int counter = 0;
        int maxSequence = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==1) {
                counter++;
                if (counter > maxSequence) {
                    maxSequence = counter;
                }
            }
            else{
                counter=0;
            }
        }
        System.out.println(maxSequence);
    }
}
