class Solution {
    public int removeElement(int[] nums, int val) {
        int max = Integer.MAX_VALUE;
        int same = nums.length;
        int k =0;
        for (int i =0; i< nums.length; i++){
            if(nums[i] == val){
                nums[i] = max;
                k++;
            }
        }
        Arrays.sort(nums);
        return same - k;
    }
}