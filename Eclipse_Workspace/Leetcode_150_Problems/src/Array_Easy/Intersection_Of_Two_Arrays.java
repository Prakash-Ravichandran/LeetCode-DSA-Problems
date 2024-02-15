package Array_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Of_Two_Arrays {

	public int[] intersect(int[] nums1, int[] nums2) {

		int length = 0;
		// assigning length for intersecting array
		if (nums1.length > nums2.length) {
			length = nums1.length;
		} else {
			length = nums2.length;
		}

		int[] Intersected_arr = new int[length];
		System.out.println("nums1 array is=" + Arrays.toString(nums1));
		System.out.println("nums2 array is=" + Arrays.toString(nums2));
		System.out.println("Length of Intersected array=" + Intersected_arr.length);

		int j = 0;
		for (int i = 0; i < length-1; i++) {
			// on matchcase
			if (nums1[i] == nums2[j]) {
				Intersected_arr[j] = nums1[i];
				j++;
				System.out.println("Intersected_arr="+Arrays.toString(Intersected_arr));
			}
			// not matching case
			else {
				//i++;
			}
		}
		System.out.println("Interesected arr is="+Arrays.toString(Intersected_arr));
		return Intersected_arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection_Of_Two_Arrays obj = new Intersection_Of_Two_Arrays();
		//int[] nums1 = { 1, 2, 2, 1 };
		//int[] nums2 = { 2, 2 };
		
		int[] nums1 = {4, 9, 5};
		int[] nums2 = {9, 4, 9, 8, 4};
		obj.intersect(nums1, nums2);
	}

}
