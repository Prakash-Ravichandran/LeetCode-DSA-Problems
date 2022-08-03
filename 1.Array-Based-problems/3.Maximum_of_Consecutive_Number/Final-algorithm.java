import java.util.*;

class Solution {
    
    int sum = 0;
    int max =0;
    
    public int findMaxConsecutiveOnes(int[] nums) {
        for(int i : nums){
             if( i == 1 ){
             sum++;
             max = Math.max(sum,max);
            }
            else{
                sum =0;
            }
         }
        return max;
    }
}