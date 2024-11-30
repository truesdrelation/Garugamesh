package java101;

import java.util.Arrays;

public class Main {
   
    public static void main(String[] args) {

        //input & print for practice problem 1

        int[] arr = {4, 3, 2, 8, 3};
        int tim = 1;
		System.out.println(PracticeProblems.countOccurrences(arr, tim));
        
        // input & print for practice problem 2 (I was getting an issue when printing the resut normally so I had to use java.util.Arrays to convert the result into a string)

        int[] arr2 = {1, 3, 6};
        System.out.println(Arrays.toString(PracticeProblems.reversearray(arr2)));

        // input & print for practice problem 3

        double[][] grid = {
        {0.5, 1.5, 4},
        {3.5, 4.5, 5.5}
        };
		System.out.println(PracticeProblems.sumGrid(grid));
    
        // input & print for practice problem 4 (this method considers the first value in the fibbonachi sequence 1 from 0 + 1 = 1)

        int n2 = 10;
        System.out.println(PracticeProblems.fib(n2+1));
    
    }
}


