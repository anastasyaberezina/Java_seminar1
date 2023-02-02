package lesson1;

import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        minMax();
    }

    public static void minMax() {
        int[] arra = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arra.length-1; i++) {
            {
                arra[i] = rand.nextInt(10);
                System.out.print(arra[i] + " ");
            }

            int minValue = arra[0];
            for (int j = 0; j < arra.length-1; j++) {
                if (minValue > arra[j]) {
                    minValue = arra[j];
                }
            }
            System.out.println();
            System.out.println(minValue);

            int maxValue = arra[0];
            for (int k = 0; k < arra.length-1; k++) {
                if (maxValue < arra[k]) {
                    maxValue = arra[k];
                }
            }
            System.out.println();
            System.out.println(maxValue);
        }
    }
}

