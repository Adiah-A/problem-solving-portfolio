class Solution {
    public int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;

        int left = 0;
        int right = height.length - 1;


        while(left < right){

            int currArea = maxWaterArea(left, right, height);
            area = Math.max(area, currArea);
            
            //We need to a way to know if it is teh left or right that has the smallest width and use that to know which to advance till we find a higher width

            if(height[left] < height[right]){
                int tempHeight = height[left];
                while(left < right && height[left] <= tempHeight){
                    left++;
                }
            }else{
                int tempHeight = height[right];
                while(left < right && height[right] <= tempHeight){
                    right--;
                }
            }

        }

        return area;
    }

    private int maxWaterArea(int left, int right, int[] height){
        int length = right - left;
        int width = Math.min(height[left], height[right]);
        int area = length * width;

        return area;
    }
}