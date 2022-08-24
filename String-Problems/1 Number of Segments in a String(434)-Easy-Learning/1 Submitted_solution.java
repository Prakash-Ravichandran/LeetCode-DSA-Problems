class Solution {
    public int countSegments(String s) {
    // String[] x = s.split("[ ]");
    // String[] x = s.split(/\.|\s/);
    // String[] x =  s.split("[\\s ,]+"); // last one
    // String[] x =  s.split("[, ]");
    String[] x = s.trim().split("\\s+");

    int count = 0;

    if(s.trim().length() > 0){
       for(String b : x){
       count++;
       }
    }
    else {
       return count;
    }
      return count;
      }
    }