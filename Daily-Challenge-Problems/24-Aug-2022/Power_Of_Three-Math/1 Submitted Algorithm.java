// problem link : https://leetcode.com/problems/power-of-three/

class Solution {
    public boolean isPowerOfThree(int n) {
       boolean isPowerOfThree = false;
       int standardInput = n;    
       int count = 0;
        
       while( n !=0){
          n = n/3;
           if( n == 0){
             // 
           }
           else{
               count++; 
           }
       } 
        
       int powOutput = (int) Math.pow(3,count);
       if( standardInput == powOutput){
           isPowerOfThree = true;
           return isPowerOfThree;
       }
       else  {
             isPowerOfThree=false;
       }
        
        return isPowerOfThree;
    }
}