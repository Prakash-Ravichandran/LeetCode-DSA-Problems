package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TP1_Max_Ascending_SubArray {
	
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
		
		// writing in 2 X 2 Matrix form
	    int[][] subArrs = new int[subArr_Count][Asc_SubArr.length];
		for(int k=0; k < subArr_Count;k++) {
			 for(int l=0,m=1; m<Asc_SubArr.length; l++,m++) {
				 if(Asc_SubArr[l] > Asc_SubArr[m]) {
					 subArrs[k][l] = Asc_SubArr[l];
				 }
				 else {
					 continue;
				 }
				  
			 }
			
		}
	
		sumOfArray(nums);
		maxOfAll(nums);
		System.out.println("The Second Dimension of Matrix="+subArr_Count);
		System.out.println("The Sub-arr="+Arrays.deepToString(subArrs));
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
        TP1_Max_Ascending_SubArray obj = new TP1_Max_Ascending_SubArray();
        int[] TC1_Arr = {10,20,30,5,10,50};
        int[] TC2_Arr = {10,20,30,40,50};
        int[] TC3_Arr = {12,17,15,13,10,11,12};
        obj.Ascending_SubArray(TC3_Arr);
	}

}

