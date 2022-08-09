class Solution {
  
    public int findLengthOfLCIS(int[] nums) {
        int globalCount=0, currCount = 0;
        
        for( int i=0; i < nums.length; i++){
        
            if( i ==0) currCount++;
            else{
                if (nums[i] > nums[i-1]){
                    currCount++;
                }else{
                    globalCount = Math.max(globalCount,currCount);
                     currCount = 1;
                }
            }
        }
        return Math.max(globalCount, currCount);
    }
}