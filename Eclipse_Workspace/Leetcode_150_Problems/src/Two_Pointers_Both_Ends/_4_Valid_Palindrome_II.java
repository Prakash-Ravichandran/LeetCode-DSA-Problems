package Two_Pointers_Both_Ends;

public class _4_Valid_Palindrome_II {

	
	public boolean removeAtMostCharacter(String s) { 
		boolean isValidPalindrome =false;

		for (String c: s.split("")) {
			String trimmed_c=s.replace(c,""); // System.out.println("The trimmed character="+trimmed_c); 
			boolean bool = validPalindrome(trimmed_c); 
			if(bool) {
				isValidPalindrome =true; break;
			} 
			else {
				isValidPalindrome=false; 
				continue;
			}
		}
		return isValidPalindrome;
	}
	
	public boolean validPalindrome (String s) {

		boolean b= true;
		//System.out.println("The input String="+s.replaceAll("[A-Za-z0-9]", "").toLowerCase()); String modified_s-s.replaceAll("[A-Za-z0-9]", "").toLowerCase();
        String modified_s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		char[] inputChar= new char[modified_s.length()]; 
		  for(int k=0; k<modified_s.length(); k++) {
			  inputChar[k]=modified_s.charAt(k);
			  //System.out.println("The Char array is="+Arrays.toString(inputChar));
		  }
		int i=0; //First Pointer Index int 3-modified s.length() 1; //Second Pointer Index
        int j=modified_s.length() -1;
		
		int count = modified_s.length()/2;
		int counter =0;

		while(i<j){
			if(inputChar[i]==inputChar[j]){
				i=i+1; //moving first pointer index forward j-j-1; // moving first pointer index backward counter++; // a counter for meeting the midpoint of a string
				j=j-1;
				counter++;
			}
			else{
				b = false;
				break;
			}
		}
		if(counter==count) {
			b=true;
		}
		return b;
	}
	public static void main(String[] args) {
		_4_Valid_Palindrome_II obj = new _4_Valid_Palindrome_II();

		boolean b1 =obj.removeAtMostCharacter("abca");
		System.out.println("The String: " +"abca " +"is a palindrome="+b1); 

		boolean b2 =obj.removeAtMostCharacter ("abc");
		System.out.println("The String: " +"abc " +"is a palindrome="+b2);

		boolean b3 =obj.removeAtMostCharacter("madakm");
		System.out.println("The String: " +"madakm " +"is a palindrome="+b3);

		boolean b4 =obj.removeAtMostCharacter("raceacar");
		System.out.println("The String: " +"raceacar " +"is a palindrome="+b4);

		boolean b5 =obj.removeAtMostCharacter("abbak");
		System.out.println("The String: " +"abbak " +"is a palindrome="+b5);
		
		boolean b6 =obj.removeAtMostCharacter("pidbliassaqozokmtgahluruufwbjdtayuhbxwoicviygilgzduudzgligyviciowxbhuyatdjbwfuurulhagtmkozoqassailbdip");
		System.out.println("The String: " +"abbak " +"is a palindrome="+b6);
	}

}
