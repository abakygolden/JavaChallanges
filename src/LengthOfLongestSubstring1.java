import java.util.HashSet;

public class LengthOfLongestSubstring1 {
    public LengthOfLongestSubstring1(){};

    public static int lengthOfLongestSubstring(String s) {
        int leftPointer = 0, rightPointer = 0, result = 0;
        HashSet<Character> chars = new HashSet<>();
        while (rightPointer < s.length()) {
            if (!chars.contains(s.charAt(rightPointer))) {
                chars.add(s.charAt(rightPointer));
                result = Math.max(result, chars.size());
                rightPointer++;
            } else {
                chars.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return result;

    }


/*
    12/10/23 Didnt work
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int startIndex = 0, max = 0, endIndex = 1;
        String tmp = "", tmp2 = s, result = "";
        String a = "";
        for (int i = 0; !tmp2.isEmpty(); i++) {
            a = tmp2.substring(0, 1);
            if (tmp.contains(a)) {
                if (tmp.length() > max) {
                    result = tmp;
                }
                i--;

                startIndex = endIndex;
                tmp = "";
                break;
            } else {
                endIndex++;
                if (max < result.length()) {
                    max++;
                }

            }
            tmp = tmp + a;
            tmp2 = tmp2.substring(1, tmp2.length());
        }
        System.out.println("tmp "+tmp );
        System.out.println("result "+ result);
        return result.length() < tmp.length() ? tmp.length() : result.length();

    }*/

}
