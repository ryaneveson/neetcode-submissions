class Solution {
    public int maxArea(int[] heights) {
    int max = 0;
    int start = 0;
    int end = heights.length-1;
    while(start<end){
        int area = Math.min(heights[start], heights[end]) * (end - start);
        max = Math.max(max, area);
        if(heights[start] <= heights[end]){
            start++;
        }else{
            end--;
        }
    }
    return max;    
    }
}
