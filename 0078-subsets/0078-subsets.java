class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, result, new ArrayList<>(), 0);
        return result;
    }

    public void generate(int[] nums, List<List<Integer>> result, List<Integer> current, int index) {
        result.add(new ArrayList<>(current)); // Add the current subset to the result
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generate(nums, result, current, i + 1); // Pass i + 1 instead of index + 1
            current.remove(current.size() - 1);
        }
    }
}