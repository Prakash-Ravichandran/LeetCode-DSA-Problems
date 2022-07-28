class Solution {
    
   List<String> rangeArray = new ArrayList<String>();
 
    public static boolean sequenceCheck(int a, int b){
        int difference = 1;
        int actualDiff = b-a;
        if( actualDiff == difference){
        return true;
        }
        else {
        return false;
        }
    } 

    public List<String> summaryRanges(int[] nums) {
       for(int i=0;i< nums.length; i++){
            int startingRange = nums[i];
            while(i+1 < nums.length && sequenceCheck(nums[i],nums[i+1]))i++;
            if( nums[i]!=startingRange ){
                rangeArray.add(startingRange+"->"+nums[i]);
            }
            
            else {
                rangeArray.add(startingRange+"");
              }
         }
         return rangeArray;
 }
}