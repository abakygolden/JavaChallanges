import java.util.ArrayList;

public class DecodeStringAtIndex880 {
    public DecodeStringAtIndex880() {
    }

    ;

    /*This solution worked but got timed out in one of the scenarios
    *   public static String decodeAtIndex(String s, int k) {
            String result = "";
            k--;
            int index = 0;
            while (result.length() <= k) {
                char tmp = s.charAt(index);
                if (Character.isDigit(tmp)) {
                    int n = Character.getNumericValue(tmp) -1;
                    String currentResult = result;
                    for (int i = 0; i < n; i++) {
                        result += currentResult;
                    }
                } else {
                    result += tmp;
                }
                index++;

            }
            return String.valueOf(result.charAt(k));
        }
    *
    * */
    public static String decodeAtIndex(String s, int k) {

        StringBuilder result = new StringBuilder();
        k--;
        int stringIndex = 0, resultLength = 0;
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> ammounts = new ArrayList<>();

        while (resultLength <= k) {
            char tmp = s.charAt(stringIndex);
            if (Character.isDigit(tmp)) {
                if (!result.isEmpty()) {
                    strings.add(result.toString());
                    result = new StringBuilder();
                }

                Integer n = Character.getNumericValue(tmp) ;
                ammounts.add(n);
                resultLength = resultLength * (n );
            } else {
                result.append(tmp);
                resultLength++;
            }
            stringIndex++;

        }
        if (!result.isEmpty()) {
            strings.add(result.toString());
        }
        k++;
        while (k != 0 ) {
        }

        return "";
    }


}
