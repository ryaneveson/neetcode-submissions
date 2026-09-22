class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] dummy = new int[m+n];
        int point1 = 0;
        int point2 = 0;
        for(int i = 0; i < n+m; i++){
            if(point1 == m){
                dummy[i] = nums2[point2];
                point2++;
            }else if(point2 == n){
                dummy[i] = nums1[point1];
                point1++;
            }else if(nums1[point1]>=nums2[point2]){
                dummy[i] = nums2[point2];
                point2++;
            }else{
                dummy[i] = nums1[point1];
                point1++;
            }
        }
        for(int i = 0; i < n+m; i++){
            nums1[i] = dummy[i];
        }
    }
}
