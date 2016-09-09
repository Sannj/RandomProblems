package RandomProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 8/22/16.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        int q = Integer.parseInt(scan.next());

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }
/*
        for(int i =0;i<k;i++){
            int temp = arr[n-1];
            for(int j = n-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
*/


        int[] newArr = new int[n];
        int pos = k-1;
        for(int i = 0;i<n;i++){
            if(k>=n){
                k=0;
            }
            newArr[k] = arr[i];
            k++;
        }


        for(int i =0;i<q;i++){
            int m = scan.nextInt();
            System.out.println(newArr[m]);
        }


    }
}
