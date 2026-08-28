class Solution {
    public int characterReplacement(String s, int k) {
        //this is the initialization of the frequency array
        int [] count = new int[26];
        int l = 0;
        int maxLength = 0;
        int maxCount = 0;

        for(int r = 0; r< s.length(); r++){
            char rightChar = s.charAt(r);
            //what we are doing here is that we are increasing the count of a specific character in the window. 
            count[rightChar - 'A']++;

            maxCount = Math.max(maxCount, count[rightChar - 'A']);
// this while loop is going to check if there are more replacements than there is amount of k in the window. if there are it will shrink the window again
            while((r-l + 1) - maxCount > k ){
                char leftChar = s.charAt(l);
                // here we are doing the opposite. we are decreasing the count as we are shrinking the window so that the k requirement is still met.
                count[leftChar - 'A']--;
                l++;
            }
            // after every loop through it will update the window size to the max possible size we have found yet.
            maxLength = Math.max(maxLength , r-l+1);
        }
        return maxLength;
    }
}
