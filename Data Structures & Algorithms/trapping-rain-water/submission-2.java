class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length -1;
        int startMax = height[start];
        int endMax = height[end];
        int storage = 0;
        while(start < end){
            if(startMax <= endMax){
                start++;
                startMax = Math.max(startMax, height[start]);
                storage += startMax - height[start];
            }else{
                end--;
                endMax = Math.max(endMax, height[end]);
                storage += endMax - height[end];
            }
        }
        return storage;
    }
}
