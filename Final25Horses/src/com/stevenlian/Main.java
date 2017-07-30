//        This code contains a simulation of the 25 horses problem; you have 25 horses;
//        you can race up to 5 horses at a time; solve for the 3 fastest horses.
//
//        www.programmerinterview.com/index.php/puzzles/25-horses-3-fastest-5-races-puzzle
//
//        Approach
//        1. Create an initial 2-D array (5x5) and randomize
//        all 25 integers from 0-1000 (simulating horsepower / horse speed)
//          (e.g.)
//        [184, 299, 561, 972, 149]
//        [700, 451, 278, 692, 163]
//        [111, 7, 805, 192, 196]
//        [885, 267, 1, 858, 456]
//        [262, 44, 184, 713, 859]
//
//        2. Sort all 5 arrays from smallest to biggest, simulating 5 races.
//          (e.g.)
//        [149, 184, 299, 561, 972]
//        [163, 278, 451, 692, 700]
//        [7, 111, 192, 196, 805]
//        [1, 267, 456, 858, 885]
//        [44, 184, 262, 713, 859]
//          (e.g.)
//        3. Take the winning horse from each race and race them (i.e. placing them in a 1-D array (size: 5)
//          and sorting the array)
//
//
//        [972,700,805,885,859] --> [700, 805, 859, 885, 972]
//
//        4. The winning horse in this array is fastest horse; we need one last 'race' to find
//          the 2nd fastest and third fastest horse

//        5. Take 2nd place and 3rd place from the first race won by the fastest horse (i.e. array #6[4]);
//        Take the second fastest horse from the 6th race (i.e. array #6[3]) and take
//          the 2nd place horse from the race won by second fastest horse array6[3];
//        Take third place from race #6

//        6. put these 5 values into an array and sort it; 1st and 2nd will be
//          the ultimate 2nd and 3rd fastest respectively

package com.stevenlian;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] setArray = Methods.randomizedArray(5); //called method that randomized each object in the array and then 'locked it'

        System.out.println(Arrays.toString(setArray[0]));
        System.out.println(Arrays.toString(setArray[1]));
        System.out.println(Arrays.toString(setArray[2]));
        System.out.println(Arrays.toString(setArray[3]));
        System.out.println(Arrays.toString(setArray[4]));//visualization for coder

        System.out.println();

        Methods.raceOneToFive(setArray, 5); //this method will take the locked method and organize it from biggest to smallest

        System.out.println(Arrays.toString(setArray[0]));
        System.out.println(Arrays.toString(setArray[1]));
        System.out.println(Arrays.toString(setArray[2]));
        System.out.println(Arrays.toString(setArray[3]));
        System.out.println(Arrays.toString(setArray[4]));

        System.out.println();

        Methods.race6(setArray, 5);
        System.out.println(Arrays.toString(setArray[0]));
        System.out.println(Arrays.toString(setArray[1]));
        System.out.println(Arrays.toString(setArray[2]));
        System.out.println(Arrays.toString(setArray[3]));
        System.out.println(Arrays.toString(setArray[4]));

        System.out.println();

        System.out.println("Fastest Horse with Horsepower: " + setArray[0][4]);

        Methods.race7(setArray[0][3],setArray[0][2], setArray[1][4], setArray[1][3], setArray[2][4] );

    }
}
