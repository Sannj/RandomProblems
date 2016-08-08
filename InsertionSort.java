package RandomProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 8/7/16.
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 values of the array");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Beginning insertion sort");
        int j, temp;
        for (int i = 1; i < 5; i++) {
            for (j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
        System.out.println("Sorted elements are - ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Time Complexity - Best case - O(n) - incase of a sorted list\n Worst Case - O(n*n)");
    }

}
