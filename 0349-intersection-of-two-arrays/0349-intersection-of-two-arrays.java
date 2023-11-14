class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1= new  HashSet<Integer>();
         HashSet <Integer> set2= new  HashSet<Integer>();
        for(int num:nums1)
        {
            set1.add(num);
        }
          for(int n:nums2)
        {
            set2.add(n);
        }
        set1.retainAll(set2);
        int a[]=new int[set1.size()];
        int i=0;
        for(int num:set1)
        {
            a[i++]=num;
        }
        return a;
        
        
    }
}