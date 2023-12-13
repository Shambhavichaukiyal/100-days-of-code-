class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
       int s= nums.length-k;
        return nums[s];
    }
}