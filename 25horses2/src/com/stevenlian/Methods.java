package com.stevenlian;

/**
 * Created by Steven Lian on 7/24/2017.
 */
/*

//This code contains a simulation of the 25 horses problem and solves for the 3 fastest horses

//www.programmerinterview.com/index.php/puzzles/25-horses-3-fastest-5-races-puzzle/

Approach
1. Create five initialArrays of size 5 (one-dimensional arrays) and randomize all 25 integers from 0-1000 (simulating horsepower)

[184, 299, 561, 972, 149]
[700, 451, 278, 692, 163]
[111, 7, 805, 192, 196]
[885, 267, 1, 858, 456]
[262, 44, 184, 713, 859]

2. Sort all 5 intialArrays, simulating 5 races

[149, 184, 299, 561, 972]
[163, 278, 451, 692, 700]
[7, 111, 192, 196, 805]
[1, 267, 456, 858, 885]
[44, 184, 262, 713, 859]

3. Create array6 with the winning horses from each race and sort  array6

[972,700,805,885,859] --> [700, 805, 859, 885, 972]

4. array6[4] is fastest horse; need one last 'race' to find 2nd fastest and third fastest horse
5. -take 2nd place and 3rd place from the race won by the fastest horse array6[4]
    -take 2nd place from race won by second fastest horse array6[3]
    -take 2nd and 3rd from race6
    -put all 5 values into an array and sort it; 1st and 2nd will be the ultimate 2nd and 3rd fastest respectively



public class Methods {


}

*/