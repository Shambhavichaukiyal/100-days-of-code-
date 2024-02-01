import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array to make it easier to deal with duplicates
        
        List<List<Integer>> triplets = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // Skip duplicates
                int l = i + 1;
                int r = nums.length - 1;
                int target = -nums[i]; // We are looking for two numbers that sum up to this target
                
                while (l < r) {
                    if (nums[l] + nums[r] == target) {
                        triplets.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) l++; // Skip duplicates
                        while (l < r && nums[r] == nums[r - 1]) r--; // Skip duplicates
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        
        return triplets;
    }
}
