
public class BinarySearch {

    public BinarySearch(){}
    public static int binarySearch(int[] arr, int target){
        return findIndex(arr, target, 0, arr.length-1);
    }

    private static int findIndex(int[] arr, int target, int startIndex, int endIndex) {
        if(startIndex > endIndex){
            return -1;
        } else {
            int middle = startIndex+endIndex / 2;
            if(arr[middle]== target){
                return middle;
            } else if (arr[middle]< target) {
                return findIndex(arr,target,middle, endIndex);
            } else {
                return findIndex(arr,target,startIndex, middle);
            }
        }
    }


}
