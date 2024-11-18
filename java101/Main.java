package java101;

public class Main {
// this section defines arr, an array
    public static void main(String[] args) {
        // //here it is being defined as an array of integers
        // int[] arr = {1, 4, 6, 9};
        // //here a funtion shown later is being run for arr
        // printIntArray(arr);
        // //here it is being printed
        // System.out.println(printIntArray(arr));
        int[] arr = {4, 3, 2, 8, 3};
		System.out.println(PracticeProblems.countOccurrences(arr, 3));
                
    }
    // // a function is given a name which takes in integer array arr
    // static String printIntArray(int[] arr) {
    //     // initial definition of a variable called str
    //     String str = "(";
    //     //
    //     for (int i = 0; i < arr.length; i++) {
    //         //str is the same but with a new value
    //         str += arr[i];
    //         // if i is not the array length-1, then add a comma
    //         if (i != arr.length - 1) {
    //             str += ", ";
    //         }
    //     }
    //     //output
    //     str += ")";
    //     return str;
    // }


}

