class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];
        
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        
      
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        
        
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }
        
        int n = mergedArray.length;
        int mid = n / 2;
        
        if (n % 2 == 0) {
            // Even number of elements, return average of middle two elements
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        } else {
            // Odd number of elements, return middle element
            return mergedArray[mid];
        }
    }
}
