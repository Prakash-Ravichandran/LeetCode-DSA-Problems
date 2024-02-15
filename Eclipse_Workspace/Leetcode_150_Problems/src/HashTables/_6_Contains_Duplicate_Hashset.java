package HashTables;

import java.util.HashSet;

public class _6_Contains_Duplicate_Hashset {
	
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> container = new HashSet<>();
		
		for(int num: nums) {
			if(container.contains(num)) {
				return false;
			}
			else {
				container.add(num);
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
