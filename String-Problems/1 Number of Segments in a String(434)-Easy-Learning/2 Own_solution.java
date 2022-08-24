class Solution {
    public int countSegments(String s) {
       // String[] x = s.split("[ ]");
     //   String[] x = s.split(/\.|\s/);
     //    String[] x =  s.split("[\\s ,]+"); // last one
      //  String[] x =  s.split("[, ]");
        String[] x = s.split("\s+");
        
        int count = 0;
        
        if(s.length() > 0){
             for(String b : x){
             count++;
             System.out.println(b);
        }
          // System.out.println(count);
        }
        
       
        return count;
    }
}