package com.stevenlian;

/**
 * Created by Steven Lian on 7/29/2017.
 */
public class Methods {
    //Methods.randomizedArray creates for us a 5x5 2-D array
    public static int[][] randomizedArray(int n) {
        int[][] array = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                int newDouble = (int) (1000 * Math.random());
                array[i][j] = newDouble;
            }
        }
        return array;
    }

    //Methods.raceOneToFive sorts each row from smallest horse power to largest horse power
    public static int[][] raceOneToFive(int[][] raceOneToFiveArray, int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                if (raceOneToFiveArray[i][j] > raceOneToFiveArray[i][j + 1]) {
                    int placeHolder = raceOneToFiveArray[i][j + 1];
                    raceOneToFiveArray[i][j + 1] = raceOneToFiveArray[i][j];
                    raceOneToFiveArray[i][j] = placeHolder;
                }
            }
            for (int j = 0; j < n - 2; j++) {
                if (raceOneToFiveArray[i][j] > raceOneToFiveArray[i][j + 1]) {
                    int placeHolder = raceOneToFiveArray[i][j + 1];
                    raceOneToFiveArray[i][j + 1] = raceOneToFiveArray[i][j];
                    raceOneToFiveArray[i][j] = placeHolder;
                }
            }
            for (int j = 0; j < n - 3; j++) {
                if (raceOneToFiveArray[i][j] > raceOneToFiveArray[i][j + 1]) {
                    int placeHolder = raceOneToFiveArray[i][j + 1];
                    raceOneToFiveArray[i][j + 1] = raceOneToFiveArray[i][j];
                    raceOneToFiveArray[i][j] = placeHolder;
                }
            }
            for (int j = 0; j < n - 4; j++) {
                if (raceOneToFiveArray[i][j] > raceOneToFiveArray[i][j + 1]) {
                    int placeHolder = raceOneToFiveArray[i][j + 1];
                    raceOneToFiveArray[i][j + 1] = raceOneToFiveArray[i][j];
                    raceOneToFiveArray[i][j] = placeHolder;
                }
            }
        }
        return raceOneToFiveArray;
    }

    //Methods.race6 is our race 6 and finds the fastest horse; it sets up the 7th race through elimination of candidate
    // 2nd and third fastest horses
    public static int[][] race6(int[][] array, int n) {
        int[][] arrayB = new int[6][5];
        arrayB[0] = array[0];
        arrayB[1] = array[1];
        arrayB[2] = array[2];
        arrayB[3] = array[3];
        arrayB[4] = array[4];

        for (int i = 0; i < n; i++) {
            if (arrayB[i][4] < arrayB[i + 1][4]) {
                arrayB[5] = arrayB[i + 1];
                arrayB[i + 1] = arrayB[i];
                arrayB[i] = arrayB[5];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arrayB[i][4] < arrayB[i + 1][4]) {
                arrayB[5] = arrayB[i + 1];
                arrayB[i + 1] = arrayB[i];
                arrayB[i] = arrayB[5];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arrayB[i][4] < arrayB[i + 1][4]) {
                arrayB[5] = arrayB[i + 1];
                arrayB[i + 1] = arrayB[i];
                arrayB[i] = arrayB[5];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arrayB[i][4] < arrayB[i + 1][4]) {
                arrayB[5] = arrayB[i + 1];
                arrayB[i + 1] = arrayB[i];
                arrayB[i] = arrayB[5];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arrayB[i][4] < arrayB[i + 1][4]) {
                arrayB[5] = arrayB[i + 1];
                arrayB[i + 1] = arrayB[i];
                arrayB[i] = arrayB[5];
            }
        }
        array[0] = arrayB[0];
        array[1] = arrayB[1];
        array[2] = arrayB[2];
        array[3] = arrayB[3];
        array[4] = arrayB[4];

        return array;
    }

    public static int[] race7(int int1, int int2, int int3, int int4, int int5) {
        int[] newArray = {int1, int2, int3, int4, int5};
        int placeHolder;
        for (int i = 0; i < 4; i++) {
            if (newArray[i] > newArray[i + 1]) {
                placeHolder = newArray[i];
                newArray[i] = newArray[i + 1];
                newArray[i + 1] = placeHolder;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (newArray[i] > newArray[i + 1]) {
                placeHolder = newArray[i];
                newArray[i] = newArray[i + 1];
                newArray[i + 1] = placeHolder;
            }
        }
        for (int i = 0; i < 2; i++) {
            if (newArray[i] > newArray[i + 1]) {
                placeHolder = newArray[i];
                newArray[i] = newArray[i + 1];
                newArray[i + 1] = placeHolder;
            }
        }
        for (int i = 0; i < 1; i++) {
            if (newArray[i] > newArray[i + 1]) {
                placeHolder = newArray[i];
                newArray[i] = newArray[i + 1];
                newArray[i + 1] = placeHolder;
            }
        }

        System.out.println("Second Fastest with Horsepower: " + newArray[4]);
        System.out.println("Second Fastest with Horsepower: " + newArray[3]);
        return newArray;
    }
}
