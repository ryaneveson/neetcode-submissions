class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int happy = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int childP = g.length-1;
        int cookieP = s.length-1;
        while(childP >=0 && cookieP>=0){
            if(g[childP]<=s[cookieP]){
                childP--;
                cookieP--;
                happy++;
            }else{
                childP--;
            }
        }
        return happy;
    }
}
