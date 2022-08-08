class Solution {
    
     int oneCounter = 0;
     int zeroCounter = 0;
     int max =0;
     int zero_max =0;
     
   public boolean sequenceCheckOnes(char a){
        Character firstValue = new Character(a);  
        Object objOne = new Character('1');  
        if( firstValue.equals(objOne)){
            oneCounter++;
            max = Math.max(oneCounter,max);
            return true;
        }
        else{
             oneCounter=0;
             return false;
        }
    } 
    
    public boolean sequenceCheckZeros(char b){
        Character firstValue = new Character(b);  
        Object objOne = new Character('0');  
        if( firstValue.equals(objOne)){
            zeroCounter++;
            zero_max = Math.max(zeroCounter,zero_max);
            return true;
        }
        else{
             zeroCounter = 0;
             return false;
        }
    } 
    
    
    public boolean checkZeroOnes(String s) {
     char[] strArr = new char[s.length()];
        
        for(int i=0; i < s.length(); i++){
           strArr[i] = s.charAt(i);
       }
        
         for(int i=0; i < strArr.length; i++){
          boolean bool =  sequenceCheckOnes(strArr[i]);
          boolean bool2 =  sequenceCheckZeros(strArr[i]);
        }
         if(max > zero_max){
           // System.out.println("The longest contiguous is 1's sequence & the value is="+max);
             return true;
        }
        else if( max == zero_max){
            // System.out.println("Both are equal");
             return false;
        }
        else{
           // System.out.println("The longest contiguous is 0's sequence & the value is="+zero_max);
             return false;
        }
        
    }
}