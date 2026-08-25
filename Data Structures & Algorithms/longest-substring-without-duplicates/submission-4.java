class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int length = 0;
        HashSet<Character> c = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(c.contains(s.charAt(right))){
                c.remove(s.charAt(left));
                left++;
            }
            c.add(s.charAt(right));
            length = Math.max(length, right-left+1);
        }
        return length;
    }
}
