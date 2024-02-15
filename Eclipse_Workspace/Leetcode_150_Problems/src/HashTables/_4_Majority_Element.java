package HashTables;

import java.util.HashMap;
import java.util.Map;

public class _4_Majority_Element {
	
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> H1 = new HashMap<>();
		
		for(Integer num: nums) {
			H1.put(num, H1.getOrDefault(num,0)+1);
			
		}
		
		int majorityEle = 0;
		int majorityval = 0;
		
		for(Map.Entry<Integer,Integer> entry: H1.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue();
			if(val > majorityval) {
				majorityEle = key;
				majorityval = val;
			}
			if(majorityval > (nums.length)/2) {
				return majorityEle;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
