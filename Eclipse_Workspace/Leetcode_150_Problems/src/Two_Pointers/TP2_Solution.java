package Two_Pointers;

public class TP2_Solution {
	
	 public int maxAscendingSum(int[] nums) {
	        if(nums.length == 1){
	            return nums[0];
	        }
	        int i = 0, max = 0;
	        while(i<nums.length){
	            int count = nums[i];
	            for(int j = i;j<nums.length-1;j++){
	                if(nums[j+1]<=nums[j]){
	                    max = Math.max(count, max);
	                    break; 
	                }
	                else{
	                    count+= nums[j+1];
	                    max = Math.max(max, count);
	                }
	            }
	            i++;
	        }
	        System.out.println("Max="+max);
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP2_Solution o = new TP2_Solution();
		int[] TC1_Arr = {10,20,30,5,10,50};
		 int[] TC3_Arr = {12,17,15,13,10,11,12};
		o.maxAscendingSum(TC3_Arr);
	}

}
