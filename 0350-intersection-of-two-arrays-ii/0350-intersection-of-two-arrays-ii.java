class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];
        int i=0;
        int j=0;
        int c=0;
       
         Arrays.sort(nums1);
         Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                a[c]=nums1[i];
                    c++;
                    j++;
                    i++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return Arrays.copyOf(a,c);
    }}
       