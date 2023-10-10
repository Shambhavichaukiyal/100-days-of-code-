class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = -1; // Initialize a and c with -1 to indicate target not found
        int c = -1;
        int[] b = new int[2];
        int[] o = {-1, -1};
        int y = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                a = i;
                b[0] = a;
                y = 1;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                c = i;
                b[1] = c;
                y = 1;
                break;
            }
        }

        if (y == 1) {
            return b;
        } else {
            return o;
        }
    }
}
