package RandomProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringCompressionHashMap {

	public static void main(String[] args) {
		String target;
		String result = "";
	//	char currentChar, previousChar;
		int count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		target = scan.nextLine();
		HashMap<Character,Integer> hm = new LinkedHashMap<>();
		for(char c : target.toCharArray()){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}

	}
		String anotherResult="";
		System.out.println(hm);
		for(Entry<Character, Integer> entry : hm.entrySet()){
			anotherResult+=entry.getKey();
			if(entry.getValue() > 1){
				anotherResult+=""+entry.getValue();
			}
		}
		if(anotherResult.length()<=target.length()){
			System.out.println(anotherResult);
		}
		else 
			System.out.println(target);
	}
}
