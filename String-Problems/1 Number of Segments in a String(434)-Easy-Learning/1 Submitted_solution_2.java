class Solution {
   public int countSegments(String s) {
    String[] word; 
       
    if(s.equals("")){
       return 0;
     }
    else{
      word = s.split(" ", 0);
    }

    int count = 0;
    if(s.trim().length() > 0){
       for(int i=0; i < word.length; i++){
         if(word[i] != ""){
       count++;
       }
      }
    }
    return count;
 }
}