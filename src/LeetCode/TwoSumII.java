package LeetCode;

public class TwoSumII {
    public TwoSumII() {
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int leftPointer = 0, rightPointer = numbers.length - 1;
        while (leftPointer < rightPointer) {
            int tmp = numbers[leftPointer] + numbers[rightPointer];
            if (tmp == target) {
                result[0] = leftPointer + 1;
                result[1] = rightPointer + 1;
                break;
            } else if (tmp < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return result;
    }
}
