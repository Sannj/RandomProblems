package RandomProblems;

import java.util.Scanner;

public class BinarySearch{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of values");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the numbers in a sorted order");
		for(int i = 0; i<n;i++){
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the value you wish to search");
		int x = scan.nextInt();
		System.out.println("The index is : "+bsearch(a,n,x));
	}

	public static int bsearch(int[] a, int n, int x){
		int start = 0;
		int end = n-1;
		while(start <=end){
			int mid = start+(end-start)/2;
			if(a[mid]==x){
				return mid;
			}
			else if(a[mid]>x){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return -1;
	}
}