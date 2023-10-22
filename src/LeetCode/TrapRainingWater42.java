package LeetCode;

public class TrapRainingWater42 {
    public TrapRainingWater42() {

            /*
    * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.



    Example 1:


    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
    Example 2:

    Input: height = [4,2,0,3,2,5]
    Output: 9
    * */
    }

    public static int[] test = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    public static int[] test2 = new int[]{4, 2, 0, 3, 2, 5};

    public static int[] test3 = new int[]{2, 0, 2};

    public static int trap(int[] height) {
        int pointerLeft = 0, higestPointLeft = height[pointerLeft], pointerRight = height.length - 1, higestPointRight = height[pointerRight], water = 0;
        while (pointerLeft < pointerRight) {
            int sum = 0;
            if (higestPointLeft <= higestPointRight) {
                pointerLeft++;
                higestPointLeft = Math.max(higestPointLeft, height[pointerLeft]);
                sum = Math.min(higestPointLeft, higestPointRight) - height[pointerLeft];


            } else {
                pointerRight--;
                higestPointRight = Math.max(higestPointRight, height[pointerRight]);
                sum = Math.min(higestPointLeft, higestPointRight) - height[pointerRight];

            }
            if (sum > 0) {
                water += sum;
            }
        }
        return water;
    }


    /*TIMED OUT SOLUTION
    *
    *     public static int trap(int[] height) {
        int higestPointLeft = 0, higestPointRight =0, water = 0;
        int[] maxLefts, maxRights;
        maxLefts = new int[height.length];
        maxRights = new int[height.length];

        higestPointRight= findHigestRight(0, height);

        for (int i = 0; i < height.length; i++) {
            int sum = 0;
            higestPointRight = findHigestRight(i, height);
            higestPointLeft = findHigestLeft(i, height);

            sum = Math.min(higestPointLeft, higestPointRight)-height[i];
            if(sum > 0){
                water += sum;
            }


        }
        return water;
    }

    public static int findHigestRight(int index, int[] height) {
        int max = 0;
        for (int i = index; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }

    public static int findHigestLeft(int index, int[] height) {
        int max = 0;
        for (int i = index; i >= 0 ; i--) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }

    *
    *
    * */
    /*

    public static int trap(int[] height) {
        int leftPoint = 0, rightPoint = 0, higestPoint = height[0], water = 0;

        //First iteration get all the water in between the hiegest poitns
        water = loopHeight(height, rightPoint, higestPoint, leftPoint, water);


        //Second iteration to find the second
        if (leftPoint != height.length - 1) {
            rightPoint = leftPoint+1;
            higestPoint = 0;
        }
        water = loopHeight(height, rightPoint, higestPoint, leftPoint, water);


        return water;
    }

    private static int loopHeight(int[] height, int rightPoint, int higestPoint, int leftPoint, int water) {
        while (rightPoint < height.length) {
            if ((height[rightPoint] >= higestPoint) && (leftPoint != rightPoint)) {
                higestPoint = height[rightPoint];
                water += measureWater(leftPoint, rightPoint, height);
                leftPoint = rightPoint;
            } else {
                rightPoint++;
            }

        }
        return water;
    }

    public static int measureWater(int leftPoint, int rightPoint, int[] height) {
        int water = 0;
        for (int a = leftPoint; a < rightPoint; a++) {
            if ((height[a] < height[leftPoint]) && (height[a] < height[rightPoint])) {
                water += Math.min(height[leftPoint], height[rightPoint]) - (height[a]);
            }
        }

        return water;
    }

*/
}
