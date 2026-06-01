class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> index = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            index.put(nums[i],i);
        }
        for(int i = 0; i< nums.length; i++){
            int difference = target - nums[i];
            if(index.containsKey(difference)&& index.get(difference) != i){
                return new int[] { i, index.get(difference)};
            }
        }
        return new int[0];
    }
}
