package RandomProblems;

import java.util.ArrayList;
import java.util.Collections;

public class sortColumn2DArray {
	public static void main(String args[]) {
		ArrayList<Pair> arrayList = new ArrayList<>();
		Pair p1 = new Pair(1, 1.5);
		Pair p2 = new Pair(2, 2.5);
		Pair p3 = new Pair(3, 1.2);
		Pair p4 = new Pair(4, 1.4);
		arrayList.add(p1);
		arrayList.add(p2);
		arrayList.add(p3);
		arrayList.add(p4);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList.toString());
		
	}
}
