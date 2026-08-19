class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            numbers.add(num);
        }
        
        for(int num : nums){
            if(!numbers.contains(num-1)){
                int length = 1;
                while(numbers.contains(num+length)){
                    length++;
                }
        // Do a math function that compares the current result with the current streak you have and take the max
            longest = Math.max(longest,length);
        }
        }
        return longest;
    }
}

