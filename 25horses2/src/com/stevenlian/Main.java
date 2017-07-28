

package com.stevenlian;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        int[] setArray1 = randomizeArray(5);
        int[] setArray2 = randomizeArray(5);
        int[] setArray3 = randomizeArray(5);
        int[] setArray4 = randomizeArray(5);
        int[] setArray5 = randomizeArray(5);

        System.out.println(Arrays.toString(setArray1));
        System.out.println(Arrays.toString(setArray2));
        System.out.println(Arrays.toString(setArray3));
        System.out.println(Arrays.toString(setArray4));
        System.out.println(Arrays.toString(setArray5));

        System.out.println();

        sortArray(setArray1, 5);
        sortArray(setArray2, 5);
        sortArray(setArray3, 5);
        sortArray(setArray4, 5);
        sortArray(setArray5, 5);

        System.out.println(Arrays.toString(setArray1));
        System.out.println(Arrays.toString(setArray2));
        System.out.println(Arrays.toString(setArray3));
        System.out.println(Arrays.toString(setArray4));
        System.out.println(Arrays.toString(setArray5));

        System.out.println();

        race6(setArray1[4], setArray2[4], setArray3[4], setArray4[4], setArray5[4], 5);


        /*//race 6
        Integer[] integerArray = new Integer[5];

        integerArray[0] = setArray1[1];
        integerArray[1] = setArray2[1];
        integerArray[2] = setArray3[1];
        integerArray[3] = setArray4[1];
        integerArray[4] = setArray5[1];
        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println(Arrays.deepToString(integerArray));
        System.out.println();*/


    }

    //modify arrays to list

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

    public static int race6(int a5, int b5, int c5, int d5, int e5, int n) {
        int[] array = {a5, b5, c5, d5, e5};
        int placeHolder;

        if (n > -1) {

//            for (int i = 0; i < 4; i++) {
//                if (array[i + 1] < array[i]) {
//                    placeHolder = array[i + 1];
//                    array[i + 1] = array[i];
//                    array[i] = placeHolder;

                    sortArray(array, 5 - 1);

                }


        System.out.println(Arrays.toString(array));
        System.out.println("Fastest horse: " + array[4]);

        return e5;    //need to return e5,e4,e3


    }


       /* Integer[] integerArray = new Integer[n];

        for (int i = 0; i < n; i++) {

            integerArray[i] = newArray[i];
        }



        System.out.println(Arrays.deepToString(integerArray));
*/


    public static int[] randomizeArray(int n) { //randomize arrays
        int[] array = new int[n];
        for (int j = 0; j < n; j++) {

            int newDouble = (int) (1000 * Math.random());
            array[j] = newDouble;

        }
        return array;

    }



}
