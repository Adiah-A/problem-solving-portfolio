class Solution {
    public int maxArea(int[] height) {
        int left= 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        int area = (right - left) * Math.min(height[left], height[right]);
        maxArea = Math.max(area, maxArea);

        while(left < right){
            if(height[left] < height[right]){
                left ++;
                int newArea = (right - left) * Math.min(height[left], height[right]);
                maxArea = Math.max(newArea, maxArea);
            }else if(height[left] > height[right]){
                right--;
                int newArea = (right - left) * Math.min(height[left], height[right]);
                maxArea = Math.max(newArea, maxArea);
            }else{
                left ++;
                int newArea = (right - left) * Math.min(height[left], height[right]);
                maxArea = Math.max(newArea, maxArea);
            }
        }

        return maxArea;
    }
}