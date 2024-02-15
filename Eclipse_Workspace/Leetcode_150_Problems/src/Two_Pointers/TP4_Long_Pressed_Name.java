package Two_Pointers;

public class TP4_Long_Pressed_Name {
    public boolean isLongPressedName(String name, String typed) {
      boolean s = true;
      for(int i=0; i < name.length(); i++) {
    	  System.out.println("char="+name.charAt(i));
      }
      char name_copied[] = name.toCharArray();
      for(char c: name_copied) {
    	  System.out.println("value="+c);
      }
      char typed_copied[] = typed.toCharArray();
      for(char c: typed_copied) {
    	  System.out.println("value2="+c);
      }
      
      return s;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP4_Long_Pressed_Name obj = new TP4_Long_Pressed_Name();
		obj.isLongPressedName("alex", "aaleex");
	}

}
