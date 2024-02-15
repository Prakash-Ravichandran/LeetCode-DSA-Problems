package Two_Pointers_Both_Ends;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/sort-array-by-parity/

/*
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
    Return any array that satisfies this condition.
 * 
 * 1. Identify a num as even - %2 ==0
 * 2. Identify a num as odd - %2 !=0 
 * 
 */

public class _8_Sort_Array_By_Parity {
	
//	public boolean checkOddOrEven(int n) {
//		System.out.println("function");
//		return n%2==0 ? true : false;
//	}

	 public int[] sortArrayByParity(int[] nums) {
		 int temp=0;
		 for(int i=0,j=0; j < nums.length; j++) {
			 if((nums[j] % 2) == 0) {
			 temp = nums[i];
			 nums[i++] = nums[j];
			 nums[j] = temp;
			 }
		 }
	        return nums;
	        //[3,1,2,4]   -> [4,1,2,3] -> [4,2,1,3]
			 // [2,4,3,1]
			 
			// int i = 0;//First Pointer Index
			// int j = 0; //Second Pointer Index
	    }
	

	 
	public static void main(String[] args) {
		
		_8_Sort_Array_By_Parity obj = new _8_Sort_Array_By_Parity();
		
        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements you want to store: ");  
//        int n=sc.nextInt();  //reading the number of elements from the that we want to enter  
//        int[] array = new int[n]; //creates an array in the memory of length 10  
//        System.out.println("Enter the elements of the array: ");  
//        for(int i=0; i<n; i++)  
//        {  
//        	array[i]=sc.nextInt(); //reading array elements from the user   
//        } 
//        System.out.println(Arrays.toString(array));
          int[] nums1 = {4,1,2,3};
		  int[] nums2 = {0};
        int[] nums = obj.sortArrayByParity(nums1);
        System.out.println("Parity array="+Arrays.toString(nums));
        
	}

}
