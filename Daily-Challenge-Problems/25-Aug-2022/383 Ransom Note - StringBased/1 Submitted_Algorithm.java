// problem link: https://leetcode.com/problems/ransom-note/

class Solution {
     public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }    
    
        public static boolean canConstruct(String ransomNote, String magazine) {
        boolean isCanConstruct = false;
        char[] magazineCharArr = new char[magazine.length()];
        char[] ransomCharArr = new char[ransomNote.length()];
        String sortedMagazine = sortString(magazine);
        String sortedRansomNote = sortString(ransomNote);
        
        for(int i=0; i < sortedRansomNote.length(); i++){
            ransomCharArr[i] =  sortedRansomNote.charAt(i);
        }
        
        for(int i=0; i < sortedMagazine.length(); i++){
             magazineCharArr[i] =  sortedMagazine.charAt(i);
        }
        
        int count = 0;
        int ransomNoteLength = ransomNote.length();
        
       StringBuffer sbf = new StringBuffer(sortedMagazine);
       
       for( int i =0 ; i < ransomCharArr.length; i++){
        String c = "" + ransomCharArr[i];
        int index = sbf.indexOf(c);
      //  System.out.println( "String "+ c + " " +"is at index=" +index +"-/-");
        if( index == -1){
            return false;
        }
        sbf = sbf.deleteCharAt(index);
      //  System.out.println("o="+sortString(magazine));
      //  System.out.println("n="+sbf);
        count++;
       // System.out.println("count value is"+count);
       }
       if( count == ransomNoteLength ){
           return isCanConstruct = true;
       }
        else{
            return isCanConstruct = false;
        }
    }
}