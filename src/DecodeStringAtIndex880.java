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
    /*
    Discarded Try
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
    * */
    // Inspired ont GoMasterCode  solution explanation https://www.youtube.com/watch?v=vmgVNV0u3pE
    public static String decodeAtIndex(String s, int k) {

        StringBuilder result = new StringBuilder();
        int stringIndex = 0;
        Long resultLength = 0L;
        ArrayList<Long> stringLenghtAtIndex = new ArrayList<>();

        //Storing all length of decodedString in array
        while (k > resultLength) {
            char tmp = s.charAt(stringIndex);
            if (Character.isDigit(tmp)) {
                int n = Character.getNumericValue(tmp);
                resultLength = resultLength * (n);
            } else {
                resultLength++;
            }
            stringLenghtAtIndex.add(resultLength);
            stringIndex++;
        }

        // I know that stringLenghtAtIndex 0 = 1 and stringLenghtAtIndex[size()] = resultLength

        return findK(s, k, stringLenghtAtIndex, stringLenghtAtIndex.size()-1);
    }

    public static String findK(String s, long k,ArrayList<Long> arr, int i) {
        long moduleResult = k % arr.get(i);
        char tmpChar = s.charAt(i);
        if (k == 1) {
            return String.valueOf(s.charAt(0));
        }
        if (moduleResult == 0) {
            if (Character.isDigit(tmpChar)) {
                return findK(s, k, arr, i - 1);
            } else {
                return String.valueOf(tmpChar);
            }
        } else if (k <arr.get(i)) {
            while (k < arr.get(i)) {
                i--;
            }
            return findK(s, k, arr, i);
        } else {
            return findK(s, ((k - 1) %arr.get(i) + 1), arr, i);
        }

    }

}



