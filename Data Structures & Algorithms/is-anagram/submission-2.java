class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] s_Sorted = s.toCharArray();
        char[] t_Sorted = t.toCharArray();
        Arrays.sort(s_Sorted);
        Arrays.sort(t_Sorted);
        if(Arrays.equals(s_Sorted, t_Sorted)){
            return true;
        }
        return false;
    }
}
