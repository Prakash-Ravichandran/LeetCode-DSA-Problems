package Two_Pointers_Both_Ends;

public class _13_Reverse_Words_In_A_String_III {
	
	public String reverse(String s) {
		 int i=0; //First Pointer Index 
		 int j=s.length() -1; // Second Pointer Index 
		 char temp[] = s.toCharArray();
         while(i < j) {
		 char c = temp[i];
		 temp[i] =temp[j];
		 temp[j] = c;
		 i++;
		 j--;
		 } 
         return new String(temp);
	}
	
	public String reverseWords(String s) {
		String strArr[] = s.split(" ");
		String reversed = "";
		for(int k=0; k < strArr.length; k++) {
			String m = strArr[k];
			reversed = reverse(m);
			strArr[k] = reversed;
		}
		return String.join(" ", strArr).trim().replaceAll(" +", " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_13_Reverse_Words_In_A_String_III obj = new _13_Reverse_Words_In_A_String_III();
		String reversed1 = obj.reverseWords("the sky is blue");
		System.out.println("The Reversed String 1="+reversed1);
		String reversed2 = obj.reverseWords(" hello world  ");
		System.out.println("The Reversed String 2="+reversed2);
		String reversed3 = obj.reverseWords("a good   example");
		System.out.println("The Reversed String 3="+reversed3);
	}

}
