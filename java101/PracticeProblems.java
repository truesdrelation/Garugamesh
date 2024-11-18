package java101;

public class PracticeProblems {
   //practice problem 1
    static int countOccurrences(int[] arr, int n) {
        int sum = 0;
        for(int x = 0; x < arr.length; x++)
            if (n == arr[x]) {
                sum++;
            }

        return sum;
   }
   
}
