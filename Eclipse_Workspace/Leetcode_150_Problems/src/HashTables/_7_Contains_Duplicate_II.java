package HashTables;

import java.util.HashMap;
import java.util.Map;

public class _7_Contains_Duplicate_II {
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i < nums.length; i++) {
        	if(map.containsKey(nums[i])) {
        		int idx = map.get(nums[i]);
        		  if(Math.abs(i - idx) <= k) {
        			  return true;
        		  }
        		  map.put(nums[i], i);
        	}
        	else {
        		map.put(nums[i], i);
        	}
        }
        return false;
        
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  
	}

}
