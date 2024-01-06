

class Solution {
    public int thirdMax(int[] nums) {
      
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        
        Integer[] uniqueNums = set.toArray(new Integer[0]);
        
        int size = uniqueNums.length;
        
        if (size < 3) {
           
            return uniqueNums[size - 1];
        } else {
            
            return uniqueNums[size - 3];
        }
    }
}
