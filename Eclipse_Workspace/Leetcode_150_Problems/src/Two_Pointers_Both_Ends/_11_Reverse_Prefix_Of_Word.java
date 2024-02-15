package Two_Pointers_Both_Ends;

public class _11_Reverse_Prefix_Of_Word {
	

/* What is Zero-Indexed Array

* Zero-based array indexing is a way of numbering the items in an array such that the first item of it has an index of 8, whereas a one-based array indexed array has its first item indexed as 1.

1. Reverse the segment of word that starts at index and ends at the index of the first occurrence of ch (inclusive). i. To find the index of the goven ch character &

If the character ch does not exist in word, do nothing.

*/
 public String reversePrefix(String word, char ch) {
	 int indexOfCh = word.indexOf(ch); // to find the index of given ch
	 String[] wordArr = new String[word.length()]; // to declare the length of the new string array
	 
	// Storing string to a new String array 
	 for (int i=0; i < word.length(); i++) { 
		 wordArr[i] = ""+word.charAt(i);
	 }
	// return the same word if the given character is not found 
	 if( indexOfCh== -1) {
	 return word;
	 }
	 else {
		 /* using two pointers */ 
		 int i=0; //First Pointer Index 
		 int j=indexOfCh; // Second Pointer Index 
         while(i < j) {
		 String c = wordArr[i];
		 wordArr[i] =wordArr[j];
		 wordArr[j] = c;
		 i++;
		 j--;
		 } 
	 }return String.join("", wordArr);
 }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      _11_Reverse_Prefix_Of_Word obj = new _11_Reverse_Prefix_Of_Word();
      String reversedString = obj.reversePrefix("abcdefd", 'd');
      System.out.println("The Reversed String="+reversedString);
      
      String reversedString1 = obj.reversePrefix("xyzzxe", 'z');
      System.out.println("The Reversed String="+reversedString1);
      String reversedString2 = obj.reversePrefix("abcd", 'z');
      System.out.println("The Reversed String="+reversedString2);
	}

}
