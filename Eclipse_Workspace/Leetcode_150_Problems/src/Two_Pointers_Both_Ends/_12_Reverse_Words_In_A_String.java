package Two_Pointers_Both_Ends;

public class _12_Reverse_Words_In_A_String {
	
	public String reverseWords(String s) {
		String strArr[] = s.split(" ");
		 int i=0; //First Pointer Index 
		 int j=strArr.length -1; // Second Pointer Index 
         while(i < j) {
		 String k = strArr[i];
		 strArr[i] =strArr[j];
		 strArr[j] = k;
		 i++;
		 j--;
		 } 
		return String.join(" ",strArr).trim().replaceAll(" +"," ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_12_Reverse_Words_In_A_String obj = new _12_Reverse_Words_In_A_String();
		String reversed1 = obj.reverseWords("the sky is blue");
		System.out.println("The Reversed String 1="+reversed1);
		String reversed2 = obj.reverseWords(" hello world  ");
		System.out.println("The Reversed String 2="+reversed2);
		String reversed3 = obj.reverseWords("a good   example");
		System.out.println("The Reversed String 3="+reversed3);
	}

}
