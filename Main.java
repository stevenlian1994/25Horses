package com.stevenlian;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 2};
        int n = 5;


        System.out.println(Arrays.toString(sortArray(a, 5)));

    }

    public static int[] sortArray(int[] array, int n) {
        int placeHolder;

        if (n > -1) {
            for (int i = 0; i < 4; i++) {
                if (array[i + 1] < array[i]) {
                    placeHolder = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = placeHolder;

                    sortArray(array, i - 1);
                }
            }
        }
        return array;
    }
}
