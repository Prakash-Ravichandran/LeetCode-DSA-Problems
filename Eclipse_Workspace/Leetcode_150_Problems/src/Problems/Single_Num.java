package Problems;
import java.util.Arrays;

public class Single_Num {

   public int Single_number(int[] nums){
		 int not_repeated_num=0;
		 System.out.println("Nums Array="+Arrays.toString(nums));
		 for( int x: nums) {
		      boolean bool = check_repeated(x,nums);
		      if( bool ) { System.out.println("The Num %d="+x+ " is a repeated num"); }
		      else {
		    	  System.out.println("The Num %d="+x + " is a single num");
		    	  not_repeated_num = x; return not_repeated_num;}
		      }
		 return not_repeated_num;  
		}

	 public boolean check_repeated( int x,int[] nums) {
		    int current_num_count = 0;
		    for(int y: nums) {
		    	 if(y == x) { current_num_count++;}
		    	 else {}
		    }
		    
		    if( current_num_count == 2 )  return true;
		    return false;
		}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Single_Num obj = new Single_Num();
		 int[] TC1_Arr = {2,2,1};
		 int[] TC2_Arr = {4,1,2,1,2};
		 int[] TC3_Arr = {1};
		
         obj.Single_number(TC1_Arr);
         obj.Single_number(TC2_Arr);
         obj.Single_number(TC3_Arr);
	}

}
