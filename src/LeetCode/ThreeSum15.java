package LeetCode;

import java.util.*;

public class ThreeSum15 {
    public ThreeSum15() {
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.stream(nums).boxed().sorted().toList());

        for (int i = 0; i < numberList.size(); i++) {
            Integer n = numberList.get(i);
            if (i > 0 && Objects.equals(n, numberList.get(i - 1))) {
                continue;
            }
            int leftPointer = i + 1, rightPointer = numberList.size() - 1;
            while (leftPointer < rightPointer) {

                int threeSum = n + numberList.get(leftPointer) + numberList.get(rightPointer);
                if (threeSum < 0) {
                    leftPointer++;
                } else if (threeSum > 0) {
                    rightPointer--;
                } else {
                    result.add(new ArrayList<>(Arrays.asList(n, numberList.get(leftPointer), numberList.get(rightPointer))));
                    leftPointer++;
                    while (leftPointer < rightPointer && Objects.equals(numberList.get(leftPointer), numberList.get(leftPointer - 1))) {
                        leftPointer++;
                    }
                }
            }
        }

        return result;
    }

}
