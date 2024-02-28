class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] a = new int[2];
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                a[0] = nums[j];
                a[1] = j + 1;
            }
        }
        return a;
    }
}
