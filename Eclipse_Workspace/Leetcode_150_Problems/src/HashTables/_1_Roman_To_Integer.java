package HashTables;

import java.util.Hashtable;

public class _1_Roman_To_Integer {
	
	public int romanToInt(String s) {
		Hashtable<Character,Integer> map = new Hashtable<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int sum =0, n=s.length();
		for(int i=0; i < n; i++) {
			if(i < n - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
				sum-= map.get(s.charAt(i));
			}
			else {
				sum+=map.get(s.charAt(i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
