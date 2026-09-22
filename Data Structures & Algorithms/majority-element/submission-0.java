class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> vals = new HashMap<>();
        int maxCount = 0;
        int res = 0;
        for(int num : nums){       
            vals.put(num, vals.getOrDefault(num,0)+1);
            if(vals.get(num) > maxCount){
                res = num;
                maxCount = vals.get(num);
            }
        }
        return res;
    }
}