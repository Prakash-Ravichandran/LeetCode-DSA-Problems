package Array_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Of_Two_Arrays2 {
	

	public int[] intersect(int[] nums1, int[] nums2) {

		int length = 0; 
		// assigning length for intersecting array
		if (nums1.length > nums2.length) {
			length = nums1.length;
		} else {
			length = nums2.length;
		}
		
		if(nums1.length >= nums2.length) {
			Arrays.sort(nums1);   
			Arrays.sort(nums2);  
		}

		int[] Intersected_arr = new int[length];
		List<Integer> arr = new ArrayList<>();
		System.out.println("nums1 array is=" + Arrays.toString(nums1));
		System.out.println("nums2 array is=" + Arrays.toString(nums2));
		System.out.println("Length of Intersected array=" + Intersected_arr.length);


      if(nums1.length !=1){
       for(int i=0; i < nums1.length; i++){
           for(int j=0; j < nums2.length;j++){
        	     if(nums1.length == nums2.length && !(i < nums1.length)) break;
                 if((nums1[i] == nums2[j])){
                     //Intersected_arr[i] = nums2[j];
                     arr.add(nums2[j]);
                      i++;
                   //  if(arr.contains(nums2[j])){ 
                   //  }
                   //  else{ arr.add(nums2[j]);}
                 }
                 else{}
           }
       }
      }
      else {
           for(int i=0; i < nums2.length; i++){
           for(int j=0; j < nums1.length;j++){
                 if(nums1[i] == nums2[j]){
                     //Intersected_arr[i] = nums2[j];
                     arr.add(nums2[j]);
                     i++;
                   //  if(arr.contains(nums2[j])){ 
                   //  }
                   //  else{ arr.add(nums2[j]);}
                 }
                 else{}
           }
       }
      }
  // System.out.println("Result arr="+arr);
   // System.out.println("Intersected arr is="+Arrays.toString(Intersected_arr));
    Intersected_arr = new int[arr.size()];
        for(int k=0;k < arr.size();k++){
           Intersected_arr[k] = arr.get(k);
        }
        System.out.println("arr is="+Arrays.toString(Intersected_arr)); 
		return Intersected_arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection_Of_Two_Arrays2 obj = new Intersection_Of_Two_Arrays2();
		//	int[] nums1 = { 1, 2, 2, 1 };
	    //	int[] nums2 = { 2, 2 };
			
		//	int[] nums1 = {4, 9, 5};
		//	int[] nums2 = {9, 4, 9, 8, 4};
		 //   int[] nums1={1};
		 //   int[] nums2={1,1};
		    
		  //  int[] nums1={2,1};
	      //  int[] nums2 ={1,1};
	    	
	    	int[] nums1 = {2,1};
	    	int[] nums2 = {1,2};
			obj.intersect(nums1, nums2);
		}
         
	}


