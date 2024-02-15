package Two_Pointers;

import java.util.Arrays;

public class TP1_Altered_Solution {
	public int[] Ascending_SubArray(int[] nums) {
		System.out.println("Raw num="+Arrays.toString(nums));
		int[] Asc_SubArr = nums;
		
		int i=0; //represents first p 
		int j=0; //represents second pointer
		int subArr_Count=1; // calculating the no.of sub array required 
		for(i=0,j=1; j < Asc_SubArr.length; i++,j++) {
			  if(Asc_SubArr[i] > Asc_SubArr[j]) {
				  subArr_Count++;
			  }
			  else if(Asc_SubArr[i] == Asc_SubArr[j]) { }
			  else {}
		}
		
	   
	    int max =0;
	    int s=0;
		while(s < nums.length) {
			 int sum = nums[s];
			 for(int l=s;l <nums.length-1; l++) {
				 if(nums[l+1] < nums[l]) {
					 max = Math.max(sum,max);
					 break;
				 }
				 else {
					 sum+=nums[l+1];
					 max = Math.max(max,sum);
				 }
			 }
			s++;
		}
	    System.out.println("max="+max);
		sumOfArray(nums);
		maxOfAll(nums);
		System.out.println("The Second Dimension of Matrix="+subArr_Count);
		
		return Asc_SubArr;
	}
	
    public int sumOfArray(int[] arr) {
    	int sumArr = 0;
    	for(int num: arr) {
    		sumArr = sumArr + num;
    	}
	    System.out.println("sum_of_array="+sumArr);
		return sumArr;
	}
	
   public int maxOfAll(int[] arr) {
	   int maxofAll = 0;
	   for(int num: arr) {
		   if(num > maxofAll) {
			    maxofAll = num;
		   }
	   }
	   System.out.println("max_of_array="+maxofAll);
	   return maxofAll;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP1_Altered_Solution obj = new TP1_Altered_Solution();
        int[] TC1_Arr = {10,20,30,5,10,50};
        int[] TC2_Arr = {10,20,30,40,50};
        int[] TC3_Arr = {12,17,15,13,10,11,12};
        obj.Ascending_SubArray(TC3_Arr);
	}

}
