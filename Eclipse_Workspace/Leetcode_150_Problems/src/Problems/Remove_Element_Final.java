package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Remove_Element_Final {

	// only this function is enough
	public int removeElement(int[] nums, int val) {
		int k = 0;
			List<Integer> arr = new ArrayList<>();

			for (int j=0; j < nums.length; j++) {
				if (nums[j] == val) {
					//arr = replace_with_Zero(x, arr);
				} else {
					//arr = replace_with_as_it_is(x, arr);
	                nums[k]=nums[j];
					k++;
				}
	            System.out.println("value of j="+j);
		}
		//System.out.println("list arr are=" + arr);
		//System.out.println("Value of k=" + k);
		//System.out.println("swapped list=");
		//List<String> arr_string = replace_with_underscore(arr);
		//System.out.println("arr with underscore ="+arr_string);
		//List<Integer> arr_swapped = swap(arr);
		//System.out.println("arr swapped="+arr_swapped);
		return k;
	}

	public List<Integer> replace_with_Zero(int x, List<Integer> arr) {
		arr.add(7);
		return arr;
	}

	public List<Integer> replace_with_as_it_is(int x, List<Integer> arr) {
		arr.add(x);
		return arr;
	}
	
    public List<String> replace_with_underscore(List<Integer> arr){
    	List<String> arr_string = new ArrayList<String>();
    	for(int num: arr) {
    		if(num ==0) { arr_string.add("_"); }
    		//else {arr_string.add(num);}
    	}
    	return arr_string;
    }
    
    public List<Integer> swap(List<Integer> arr){
    	
    	for(int i=0,j=1; j < arr.size(); i++,j++) {
    		if( arr.get(i) == 7) {
    			Collections.swap(arr, i, j);
    		}
    	}
    	
    	return arr;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Element obj = new Remove_Element();
		int[] TC1_Arr = { 3, 2, 2, 3 };
		int[] TC2_Arr = { 0, 1, 2, 2, 3, 0, 4, 2 };

		obj.removeElement(TC1_Arr, 3);
		obj.removeElement(TC2_Arr, 2);
	}

}
