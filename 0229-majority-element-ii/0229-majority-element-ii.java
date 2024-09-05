class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

    
        for (int num : nums) {
            if (num == ele1) {
                count1++;
            } else if (num == ele2) {
                count2++;
            } else if (count1 == 0) {
                ele1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                ele2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == ele1) count1++;
            else if (num == ele2) count2++;
        }

        
        if (count1 > nums.length / 3) result.add(ele1);
        if (count2 > nums.length / 3) result.add(ele2);

        return result;
    }
}