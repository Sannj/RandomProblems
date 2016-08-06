package RandomProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 8/5/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int i,j,n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = scan.nextInt();
        int[] arr = new int[n];
        for(i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Starting selection sort");
        int mini;
        int temp = 0;
        for(i = 0;i<n-1;i++){
            mini = i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            if(mini != i){
                temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("After sorting : ");
        for(i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nIn selection sort - we find the minimum element and place it in the first position and then second least element at the 2nd place");
        System.out.println("At the worst case, the first element is compared with every other element in the array so the worst case time complexity is O(n*n). ");
        System.out.println("Where n is the size of the array");
    }

}
