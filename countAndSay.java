package RandomProblems;
import java.util.*;

public class countAndSay {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "1";
		if(n < 1){
			System.out.println("The value of n is less than 1");
		}
		else{
			
			int i  = 1;
			while(i < n){
				StringBuilder sb = new StringBuilder();
				int count = 1; 
				for(int j = 1; j < result.length();j++){
					if(result.charAt(j) == result.charAt(j-1)){
						count++;

					}
					else{
						sb.append(count);
						sb.append(result.charAt(j-1));
						count = 1;
					}
				}
				sb.append(count);
				sb.append(result.charAt(result.length()-1));
				result = sb.toString();
				i++;
			}
		System.out.println(result);
		}

	}
}