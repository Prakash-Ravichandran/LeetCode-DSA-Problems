package HashTables;

import java.util.LinkedHashMap;

public class _2_Integer_To_Roman {
	
	public String intToRoman(int num) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		
		  String str = "";
		  
		  for(int key: map.keySet()) {
			   while(num >= key) {
				   num = num - key;
				   str = str + map.get(key);
			   }
		  }
		  return str;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
