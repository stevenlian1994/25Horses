package com.stevenlian;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 2, 10, 66, 4, 10, 2};
        int n = 10;


        System.out.println(Arrays.toString(sortArray(a, 10)));

    }

    public static int[] sortArray(int[] array, int n) {
        int placeHolder;

        if (n > -1) {
            for (int i = 0; i < n-1; i++) {
                if (array[i + 1] < array[i]) {
                    placeHolder = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = placeHolder;

                    sortArray(array, n - 1);
                }
            }
        }
        return array;
    }
}
