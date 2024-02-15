package Two_Pointers_Both_Ends;

public class _5_Reverse_Only_Letters {
	
	public boolean checkSpecialCharacter (char s) {

		boolean isSpecialCharacter = false;

		String Str=""+s;
		String specialCharacters=" !#$%&'()*+,-/;:.<=>?@[]^_`{|}0123456789";
		for (int i = 0; i < Str.length(); i++) {
		if (specialCharacters.contains(Character.toString (Str.charAt(i))))
		{
			System.out.println (Str.charAt (i)+": is a special character");
			isSpecialCharacter = true;
			return isSpecialCharacter;
		}
		}
		return isSpecialCharacter;
		}
	
	public String reverseOnlyLetters (String s) {

		char[] k=s.toCharArray();
		boolean bool1 = false;
		boolean bool2 = false;

		/* using two pointers */

		int i=0; //First Pointer Index
		int j= s.length()-1; // Second Pointer Index

		while (i < j) {
		bool1 =checkSpecialCharacter(k[i]); // returned special Characters is true =
		bool2 = checkSpecialCharacter(k[j]); // returned special Characters is true
		System.out.println("The Special character check for "+k[i]+"="+bool1);
		System.out.println("The Special character check for "+k[j]+"="+bool2); // returned special Character is false only both will become true
        
		if(!bool1 && !bool2) {	
			char c = k[i];
			k[i] = k[j];
			k[j] = c;
			i++;
			j--;
		} 
		  if(bool1) {i++;}
		  if(bool2) {j--;}
		}
		return String.valueOf(k);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_5_Reverse_Only_Letters obj = new _5_Reverse_Only_Letters();

		String s1 = obj.reverseOnlyLetters ("ab-cd");

		System.out.println("String sl reversed="+s1);

		String s2 = obj.reverseOnlyLetters ("a-bC-dEf-ghIj");

		System.out.println("String s2 reversed="+s2);

		String s3 = obj.reverseOnlyLetters ("Testing-Leet-code-Q");

		System.out.println("String s3 reversed="+s3);
		
		String s4 = obj.reverseOnlyLetters (";1yDV");
		System.out.println("String s4 reversed="+s4);
		
		String s5 = obj.reverseOnlyLetters ("1$^ps<.6");
		System.out.println("String s5 reversed="+s5);
                 
	}

}
