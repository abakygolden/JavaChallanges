import java.util.*;

public class Main {
     private Queue queue;
     private Stack stack;
     private ArrayList arrayList;

     private HashMap<Integer, String> hashMap;

    private TreeMap<Integer, String> treeMap;
    private LinkedHashMap<Integer, String> linkedMap;
    private static LinkedList<String> linkedList = new LinkedList<>();
    public static void main(String[] args) {
        BinarySearch x = new BinarySearch();
        int[] tmp = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.print(x.binarySearch(tmp,9));

    }
}
