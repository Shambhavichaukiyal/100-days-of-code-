class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, nums.length - 1, result);
        return result;
    }

    public void permute(int[] nums, int l, int r, List<List<Integer>> result) {
        if (l == r) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = l; i <= r; i++) {
                swap(nums, l, i);
                permute(nums, l + 1, r, result);
                swap(nums, l, i); // backtrack to the original array
            }
        }
    }

    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}