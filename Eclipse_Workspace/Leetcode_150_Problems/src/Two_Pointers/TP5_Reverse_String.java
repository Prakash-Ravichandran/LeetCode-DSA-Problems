package Two_Pointers;

import java.util.Arrays;

/* Write a function that reverses a string. 
 * The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 */

/*
 * An in-place algorithm is an algorithm that does not need an extra space and produces
 *  an output in the same memory that contains the data by transforming the input ‘in-place’. 
 *  However, a small constant extra space used for variables is allowed.
 */


public class TP5_Reverse_String {
	 public void reverseString(char[] s,int n) {
		 System.out.println("The String s="+Arrays.toString(s));
		 char arr[] = s;
		 
		 for (int i = 0; i < n / 2; i++)
	            arr[i] = __(arr[n - i - 1],arr[n - i - 1] = arr[i]);
	        
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s1 = {'h','e','l','l','o'};
		char[] s2 = {'H','a','n','n','a','h'};
		int n = s1.length;
		int n2 =s2.length;
		TP5_Reverse_String obj = new TP5_Reverse_String();
		obj.reverseString(s1, n);
		obj.reverseString(s2, n2);
		}

}
