class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        int l = 0;
        for(char c : s1.toCharArray()){
            freq1.put(c, freq1.getOrDefault(c,0)+1);
        }

        for(int r = 0; r<s2.length(); r++){
            while(r-l+1 > s1.length()){
                char left = s2.charAt(l);
                freq2.put(left,freq2.get(left)-1);
                if(freq2.get(left) == 0){
                    freq2.remove(left);
                }
                l++;
            }
            char right = s2.charAt(r);
            freq2.put(right,freq2.getOrDefault(right,0)+1);
            if(freq1.equals(freq2)){
                return true;
            }
        }
        return false;
    }
}
