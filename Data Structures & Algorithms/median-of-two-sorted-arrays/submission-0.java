class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (p2 >= nums2.length || (p1 < nums1.length && nums1[p1] <= nums2[p2])) {
                arr[i] = nums1[p1];
                p1++;
            } else {
                arr[i] = nums2[p2];
                p2++;
            }
        }

        int n = arr.length;
        
        if (n % 2 != 0) {
            return arr[n / 2];
        } 
        int mid = n / 2;
        return (arr[mid - 1] + arr[mid]) / 2.0;
    }
}