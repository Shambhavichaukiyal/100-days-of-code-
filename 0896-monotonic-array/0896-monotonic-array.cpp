class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        int r=0;
        int s=0;
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i-1]<=nums[i])
            {
                r++;
            }
            if(nums[i-1]>=nums[i])
            {
                s++;
            }
    }
        if(s==nums.size()-1 || r==nums.size()-1)
        {
            return true;
        }
       return false;
    }
};
