package Problems;

public class Single_Num_XOR {

	public  int singleNumber(int[] nums) {
		int ans=0; //since XOR with 0 returns same number 
		for(int i=0; i<nums.length; i++){
			ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
		}
		System.out.println("ans is ="+ans);
		return ans;    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Single_Num_XOR obj = new Single_Num_XOR();
		 int[] TC1_Arr = {2,2,1};
		 int[] TC2_Arr = {4,1,2,1,2};
		 int[] TC3_Arr = {1};
		
         obj.singleNumber(TC1_Arr);
         obj.singleNumber(TC2_Arr);
         obj.singleNumber(TC3_Arr);
	}

}
