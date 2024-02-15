package Two_Pointers_Both_Ends;

import java.util.Arrays;

public class _9_Sort_Array_By_Parity_II {
	
	
	// [4,2,5,7]
	// Even: i=0; nums[i] = 4  Even   -> no swap
	// Odd: i=1; nums[i] = 2  Odd but Even  -> needed swap
	// Even: i=2; nums[i] = 5  Even but Odd  -> needed swap
	// Odd: i=3; nums[i] = 7   Odd          -> no swap
	
	//[2,3]
	// Even: i=0; nums[i] = 2  Even   -> no swap
	// Odd: i=1; nums[i] = 3  Odd     -> no swap

	 public int[] sortArrayByParityII(int[] nums) {
		 int even=0; // First Pointer Index
	     int odd=1 ; // Second Pointer Index	
		 for(int i=0,j=0; j < nums.length;j++) {
			 
			 if(even < nums.length && nums[even]%2 ==0 ){
				 even+=2;  // move pointer to next iterator which is even
			 }
			 if(odd < nums.length && nums[odd]%2 !=0){
				 odd+=2;   // move pointer to next iterator which is odd
			 }
			 if(odd >= nums.length || even >= nums.length) break; // if both greater than nums.length break
	
			 int temp = nums[odd];
			 nums[odd] = nums[even];
			 nums[even] = temp; 
		 }
		 
		 return nums;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_9_Sort_Array_By_Parity_II obj = new _9_Sort_Array_By_Parity_II();
		  int[] nums1 = {4,1,2,3};
		  int[] nums2 = {2,3};
		  int[] nums3 = {4,2,5,7};
        int[] nums = obj.sortArrayByParityII(nums2);
        System.out.println("Parity array="+Arrays.toString(nums));
	}

}
