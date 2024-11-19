package java101;

public class PracticeProblems {
   public static char[] reversed;

    //practice problem 1
    static int countOccurrences(int[] arr, int n) {
        int sum = 0;
        for(int x = 0; x < arr.length; x++)
            if (n == arr[x]) {
                sum++;
        }

        return sum;
   }
   
   //practice problem 2
    static int[] reversearray(int[] arr2) {
        int[] reversed = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++ ) {
            reversed[i] = arr2[arr2.length - 1 - i];
         
            
        }
        return reversed;
   }

   //practice problem 3
    static double sumGrid(double[][] grid) {
        double sum = 0;
        for(double[] row : grid) {
    
         for(double value : row){
         sum += value;
            }
        }
    return sum;
   }

   //practice problem 4
   static int fib(int n2) {
       if (n2 <= 0) {
        return 0;
       } else if (n2 ==1) {
        return 1;
       } else {
        return fib(n2-1) + fib(n2 - 2);
       }

    }

}

