package com.company;
import java.util.*;
public class SecondLargestArray {

            static void print2largest(int arr[], int arr_size) {
            int i;

            if (arr_size < 2) {
                System.out.printf(" Invalid Input ");
                return;
            }

            Arrays.sort(arr);

            for (i = arr_size - 1; i >= 0; i--) {
                if (arr[i] != arr[arr_size - 1]) {
                    System.out.printf("\nSecond largest number is: %d\n", arr[i]);
                    System.out.printf("Largest number is: %d\n", arr[i + 1]);
                    return;
                }
                //In first pass, i = 9 and is equal to arr[9]
///so it will not enter
                //in second pass, i = 8 and is not equal to arr[9]
                //so it will enter
            }


        }
    public static void main(String[] args) {
        int arr[] = { 100, 14, 46, 47, 94, 52, 86, 36, 94, 89 };
        System.out.println("The given array is:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        print2largest(arr, arr.length);
    }
}
