public class MyClass {
    public static void main(String args[]) {
       int[] nums = {0,1,2,4,5,7};
  
        for(int i=0; i < nums.length; i++ ){
            System.out.println("value of i is ="+i);
            while( i+1 < nums.length && nums[i+1] - nums[i] == 1)i++;
                        System.out.println("value of  i inside while loop  is ="+i);

        }
  
    }
}