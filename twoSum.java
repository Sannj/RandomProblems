package RandomProblems;

public class twoSum {

public int[] twoSum(int[] nums, int target) {
     int sum =0;
     int[] result = new int[2];
	for(int i = 0 ;i<nums.length;i++){
		sum = nums[i];
		for(int j = i+1;j<nums.length;j++){
    		sum =	nums[i]+ nums[j];  
			if(sum == target){
    			  result[0]=i;
    			  result[1]=j; 
    			  return result;
    		  }
    	  }
      }
	return result;
    }
	
	public static void main(String[] args) {
		

	}

}
