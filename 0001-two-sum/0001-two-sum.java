class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        int a[]= new int[2];
        a[0]=-1;
            a[1]=-1;
       
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]) && i<map.get(target-nums[i]))
            {
                a[0]=i;
                a[1]=map.get(target-nums[i]);
                return a;
            }
        }
        return a;
    }
}
