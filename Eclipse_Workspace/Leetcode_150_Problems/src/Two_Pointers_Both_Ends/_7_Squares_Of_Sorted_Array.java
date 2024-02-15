package Two_Pointers_Both_Ends;

import java.util.Arrays;

public class _7_Squares_Of_Sorted_Array {

	public int[] SqaureAnArray(int[] squareNum) { 
		int[] arr = squareNum;
		int squaredNum = 0;
		for (int i=0; i < arr.length; i++) 
		{ 
		  squaredNum	= (int)Math.pow(arr[i],2);
			arr[i] = squaredNum;
	    }
        return arr;
	}
	
	public int[] sortedSqaures(int[] nums) {
		int[] nums1 = SqaureAnArray(nums);
		
		for (int i = 0; i < nums1.length; i++)   
		{  
		for (int j = i + 1; j < nums1.length; j++)   
		{  
		int tmp = 0;  
		if (nums1[i] > nums1[j])   
		{  
		tmp = nums1[i];  
		nums1[i] = nums1[j];  
		nums1[j] = tmp;  
		}  
		}  
		}
		return nums1;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_7_Squares_Of_Sorted_Array obj = new _7_Squares_Of_Sorted_Array();
		int[] nums1 = {-4,-1,0,3,10};
		int[] sortedSquares = obj.sortedSqaures(nums1);
		System.out.println("Sorted Squares="+Arrays.toString(sortedSquares));
	}

}
