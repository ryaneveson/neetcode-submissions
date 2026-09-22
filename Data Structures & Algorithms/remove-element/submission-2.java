class Solution {
    public int removeElement(int[] nums, int val) {
        int max = Integer.MAX_VALUE;
        int k = 0;
        for (int i =0; i< nums.length; i++){
            if(nums[i] == val){
                nums[i] = max;
            }else{
                k++;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}