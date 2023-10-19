public class BackspaceStringCompare844 {
    public BackspaceStringCompare844() {
    }

    ;

    public static boolean backspaceCompare(String s, String t) {
        String s1 = "", t1 = "";
        for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
            if( i < s.length()){
                s1 = checkForNumeral(s, i, s1);

            }
            if ( i< t.length()){
                t1 = checkForNumeral(t, i, t1);
            }
        }
        return s1.equals(t1);
    }

    private static String checkForNumeral(String s, int i, String s1) {
        if (s.charAt(i) == '#') {
            if (!s1.isEmpty()) {
                s1 = s1.substring(0, s1.length() -1);
            }
        } else {
            s1 = s1 + s.charAt(i);
        }
        return s1;
    }
}
