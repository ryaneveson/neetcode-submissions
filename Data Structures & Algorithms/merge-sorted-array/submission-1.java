class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;
        int y = m;
        int x = n;
        while(x>0 && y>0){
            if(nums1[y-1]>nums2[x-1]){
                nums1[last] = nums1[y-1];
                y--;
            }else{
                nums1[last] = nums2[x-1];
                x--;
            }
            last--;
        }
        while(x>0){
            nums1[last] = nums2[x-1];
            x--;
            last--;
        }
    }
}