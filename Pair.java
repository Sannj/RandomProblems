package RandomProblems;

public class Pair implements Comparable<Pair> {

	int key;
	double value;
	
	public Pair(int key, double value) {
		this.key = key;
		this.value = value;
	}
	
	public double getValue(){
		return value;
	}
	
	public int getKey(){
		return key;
	}

	@Override
	public int compareTo(Pair p) {
		if (p.getValue() == this.getValue()) {
			return 0;
		}
		if (p.getValue() > this.getValue()) {
			return -1;
		} else {
			return 1;
		}
		
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
	
	
}
