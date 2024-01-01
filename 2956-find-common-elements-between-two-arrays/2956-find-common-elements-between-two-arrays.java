import java.util.Arrays;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c = 0;
        int d = 0;

        // Find intersections in nums1
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    c++;
                    break; // Break the loop once an intersection is found
                }
            }
        }

        // Find intersections in nums2
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    d++;
                    break; // Break the loop once an intersection is found
                }
            }
        }

        int[] result = new int[2];
        result[0] = c;
        result[1] = d;
        return result;
    }
}
