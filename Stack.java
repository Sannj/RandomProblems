package RandomProblems;

import java.lang.reflect.Array;

public class Stack {

	int top = -1;
	int[] stackArray = new int[5];
	
	
	void push(int value){
		if(stackArray.length-1 == top){
			int[] newArray = stackArray;
			stackArray = new int[2*newArray.length];
			System.arraycopy(newArray, 0, stackArray,0, newArray.length);
		}
		System.out.println("Added "+value);
		stackArray[++top] = value;
		
	}
	int pop(){
		if(top == -1){
			System.out.println("No elements in the stack to pop");
			return 0;
		}
		
		System.out.println("Removed");
		return stackArray[top--];
	}
	
	void print(){
		if(top == -1){
			System.out.println("No elements in the stack to print");
		}

		for(int i =0;i<=top;i++){
			System.out.print(stackArray[i]+" ");
		}
		System.out.println("\n");
	}
	
	void reverse(){
	       int j = top;
	        for(int i = 0;i<=top/2;i++){
	            int temp = stackArray[i];
	            stackArray[i] = stackArray[j];
	            stackArray[j] = temp;
	            j--;
	        }
	}
	
	public static void main(String args[]){
		Stack s = new Stack();
		s.push(5);
		s.push(10);
		s.push(12);
		s.push(8);
		s.push(90);
		s.push(2);
		s.print();
		s.reverse();
		s.print();
	}
	
	
}
