package LeetCode;

import java.util.HashMap;

public class RomanToInteger13 {
    public RomanToInteger13() {
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        int r = 0, tmp1, tmp2 ;
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
        for(int i = 0 ; i < s.length(); i++){
            tmp1 = romanNumbers.get(s.charAt(i));
            if(i+1 < s.length()){
                tmp2 = romanNumbers.get(s.charAt(i+1));
                if( tmp1 >= tmp2 ){
                    r += tmp1;
                } else {
                    r += tmp2-tmp1;
                    i++;
                }
            } else {
                r += tmp1;
            }
            
        }
        return r;
    }
}
