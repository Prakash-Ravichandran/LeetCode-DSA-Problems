// https://leetcode.com/problems/number-of-segments-in-a-string/discuss/2470590/100-fast-java-solution


class Solution {
public int countSegments(String s) {

   String[] word;

    if(s.equals("")){
        return 0;
    }
    else{
        word = s.split(" ", 0);
    }
    int index = 0;
    int count = 0;
    while (index < word.length){
        if(word[index] != ""){
            count++;
        }
        index++;
    }

    return count;
}
}