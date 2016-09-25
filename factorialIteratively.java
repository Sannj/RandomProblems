package RandomProblems;

import java.util.Scanner;

public class factorialIteratively {

	public static void main(String[] args) {
		int target;
		long product = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		target = scan.nextInt();
		for(int i = target;i>1;i--){
			product *= i;
		}	
		System.out.println(product);
	}

}
