class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        generatePermutations(ans, nums, 0);
        return ans;
    }
    
    private void generatePermutations(List<List<Integer>> ans, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }
        
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            generatePermutations(ans, nums, index + 1);
            swap(i, index, nums); // backtrack
        }
    }
    
    private void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

   
}