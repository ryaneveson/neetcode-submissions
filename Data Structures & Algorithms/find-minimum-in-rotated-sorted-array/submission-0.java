class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int r = nums.length-1;
        while(l<r){
            if(nums[l]> nums[r]){
                l++;
            }else if(nums[l]< nums[r]){
                r--;
            }
        }
        return nums[l];
    }
}
