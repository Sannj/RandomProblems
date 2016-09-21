package RandomProblems;

import java.util.Scanner;

public class stringCompressionProblem {

	public static void main(String[] args) {
		String target;
		String result = "";
		char currentChar, previousChar;
		int count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		target = scan.nextLine();
		
		for(int i = 1;i<target.length();i++){
			previousChar = target.charAt(i-1);
			currentChar = target.charAt(i);
			if(previousChar == currentChar){
				count++;
			}
			else {
				result +=previousChar+""+count;
				count = 1;
			}		
		}
		result+=target.charAt(target.length()-1)+""+count;
		System.out.println(result);
		scan.close();
	}

}
