class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int[26];
        int l = 0;
        int maxLength = 0;
        int maxCount = 0;

        for(int r = 0; r< s.length(); r++){
            char rightChar = s.charAt(r);
            count[rightChar - 'A']++;

            maxCount = Math.max(maxCount, count[rightChar - 'A']);

            while((r-l + 1) - maxCount > k ){
                char leftChar = s.charAt(l);
                count[leftChar - 'A']--;
                l++;
            }
            maxLength = Math.max(maxLength , r-l+1);
        }
        return maxLength;
    }
}
