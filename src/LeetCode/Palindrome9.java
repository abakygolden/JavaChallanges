package LeetCode;

import java.util.HashMap;

public class Palindrome9 {
    public Palindrome9() {
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String tmp = "" + x;
        int i = 0, j = tmp.length() - 1;
        while (j > i) {
            if (tmp.charAt(i) != tmp.charAt(j)) {
                return false;
            }
            j--;
            i++;

        }
        return true;
    }
}
