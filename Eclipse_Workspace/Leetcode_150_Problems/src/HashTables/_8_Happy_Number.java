package HashTables;

import java.util.HashSet;
import java.util.Set;

public class _8_Happy_Number {
	
	// function to calculate square of a number
	 public int sqaureNum(int n) {
		 return n*n;
	 }
	
	 public boolean isHappy(int n) {
	        Set<Integer> seen = new HashSet<Integer>();
	        
	        while(n!=1 && !seen.contains(n)) {
	        	seen.add(n); // add 'n' if it is not equal to 1 & it's not in set stack.
	        	int sum=0;  
	        	// Calculating the 19  
	        	while(n > 0) {
	        		int digit = n % 10;  //Pick Each number one by one.
	        		sum = sum + sqaureNum(digit);// Calculate sum after each squares.
	        		n = n/10;  // 230 -> 23 -> 2
	        	}
	        	n = sum; //the calculated sum is the new n.
	        }
	        return n==1; // return true if 'n' equals 1.
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	}

}
