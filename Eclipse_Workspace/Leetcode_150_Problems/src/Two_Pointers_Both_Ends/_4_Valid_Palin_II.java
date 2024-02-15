package Two_Pointers_Both_Ends;

public class _4_Valid_Palin_II {
	
	public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++; j--;
        }

        if (i >= j) return true;

        if (isPalin(s, i + 1, j) || isPalin(s, i, j - 1)) return true;
        return false;
    }

    private boolean isPalin(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++; j--;
            }
            else return false;
        }
        return true;
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4_Valid_Palin_II obj = new _4_Valid_Palin_II();
		boolean bool = obj.validPalindrome("abca");
		System.out.println("The String="+"abca"+" is"+bool);
	}

}
