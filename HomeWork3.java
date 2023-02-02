package lesson1;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        numberShift();
    }

    public static void numberShift() {
       int[] nums = new int[8];
        Random rand = new Random();

        for (int i = 0; i < nums.length-1; i++) {
            {
                nums[i] = rand.nextInt(1, 4);
                System.out.print(nums[i] + " ");
            }

            int val = 3;
            for (int j = 0; j < nums.length - 1; j++) {
                for (int k = 0; k < nums.length - 1; k++) {
                    while (i < j) {
                        while (i < j && nums[j] == val) {
                            j--;
                        }
                        if (nums[i] == val) {
                            nums[i] = nums[nums.length - 1]; // Тут надо сдвинуть влево весь массив, не знаю как
                            i++;
                        }
                        return nums;
                    }

                }

            }
        }}}

