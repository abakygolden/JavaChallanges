
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


    public static int trap(int[] height) {
        int result = 0, leftPoint = 0, rightPointer = 0, higestPoint = 0, water = 0;

        //First iteration get all the water in between the hiegest poitns
        while (rightPointer < height.length) {
            if (height[rightPointer] > higestPoint) {
                higestPoint = height[rightPointer];
                water += measureWater(leftPoint, rightPointer, height);
                leftPoint = rightPointer;
            } else {
                rightPointer++;
            }

        }

        //Second iteration to find the second



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

    public static int measureWaterEnd(int leftPoint, int rightPoint, int[] height) {
        int water = 0;
         if ( height[rightPoint] < height[leftPoint]) {

         }
        for (int a = leftPoint; a < rightPoint; a++) {
            if ((height[a] < height[leftPoint]) && (height[a] < height[rightPoint])) {
                water += Math.min(height[leftPoint], height[rightPoint]) - (height[a]);
            }
        }

        return water;
    }


}
