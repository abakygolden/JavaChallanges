package LeetCode;

public class LongestCommonPrefix14 {
    public LongestCommonPrefix14() {
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        } else if ( strs.length == 1){
            return strs[0];
        }
        String result = "" , firstWord= strs[0];
        int minAmmountOfSharedChars= 500, ammountOfSharedChars= 0, minWordLenght = firstWord.length();

        for(int i = 1 ;i < strs.length; i++){
            //Update min wordLength if needed
            minWordLenght = strs[i].length() < minWordLenght ?  strs[i].length() : minWordLenght;

            //Check max ammount of chars shared
            ammountOfSharedChars = maxCharShared(firstWord, strs[i] ,minWordLenght );
            if( ammountOfSharedChars == 0 ) {
                return "";  //If there is no shared chareacters then that is it
            } else if (ammountOfSharedChars < minAmmountOfSharedChars ) {
                minAmmountOfSharedChars = ammountOfSharedChars;
            }

        }

        return  minAmmountOfSharedChars == 500 ? "" : firstWord.substring(0,minAmmountOfSharedChars) ;
    }

    public int maxCharShared(String x, String y, int minWordLenght ){
        //Will count of many shared characters there are between 2 words
        int result = 0;
        for(int i = 0 ; i < minWordLenght; i++) {
            if ( x.charAt(i) == y.charAt(i) ){
                result++;
            } else {
                return result;
            }
        }
        return result;
    }

}
