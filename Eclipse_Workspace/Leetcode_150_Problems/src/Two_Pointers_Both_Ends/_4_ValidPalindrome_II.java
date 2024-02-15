package Two_Pointers_Both_Ends;

public class _4_ValidPalindrome_II {
	public boolean validPalindrome(String s) {
		String modified_s=s.replaceAll("[A-Za-z0-9]", "").toLowerCase();

		char[] inputChar =new char[modified_s.length()]; 
		for(int k=0; k<modified_s.length(); k++) { 
		inputChar[k]=modified_s.charAt(k);
		}

		int i=0; //First Pointer Index
		int j=modified_s.length()-1; //Second Pointer Index

		while(i <j){
		if(inputChar[i]==inputChar[j]){
			i++; //moving first pointer index forward 
			j--; // moving first pointer index backward
		}
		else{
		// removing at most one pair where s.charAt(i) != s.charAt(j) 
//		String removedFirstMismatchChar=removeCharacter(s,s.charAt(j-1));
//		String removedSecondMismatchChar= removeCharacter(s, s.charAt(i+1)); 
		return isvalidPalindrome(s,i+1,j) || isvalidPalindrome (s,i,j-1); 
		}
		}
		return true;

		}
	private boolean isvalidPalindrome(String str, int s, int t){
        while (s <= t){
            if (str.charAt(s) == str.charAt(t)){
                s++;
                t--;
            }
            else
                return false;
        }
        
        return true;
    }
	
	public String removeCharacter(String s, char c) {
		s=s.replaceAll(""+c, "");
		return s;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4_ValidPalindrome_II obj = new _4_ValidPalindrome_II();
//		boolean b1 =obj.validPalindrome("abca");
//		System.out.println("The String: " +"abca " +"is a palindrome="+b1); 

		boolean b2 =obj.validPalindrome("abc");
		System.out.println("The String: " +"abc " +"is a palindrome="+b2);

		boolean b3 =obj.validPalindrome("madakm");
		System.out.println("The String: " +"madakm " +"is a palindrome="+b3);

		boolean b4 =obj.validPalindrome("raceacar");
		System.out.println("The String: " +"raceacar " +"is a palindrome="+b4);

		boolean b5 =obj.validPalindrome("abbak");
		System.out.println("The String: " +"abbak " +"is a palindrome="+b5);
		
		boolean b6 =obj.validPalindrome("pidbliassaqozokmtgahluruufwbjdtayuhbxwoicviygilgzduudzgligyviciowxbhuyatdjbwfuurulhagtmkozoqassailbdip");
		System.out.println("The String: " +"BIG " +"is a palindrome="+b6);     
	}

}
