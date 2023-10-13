class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int o=nums1.length+nums2.length;
        int a[]=new int[o];
         int k=0;
            double median;
        for(int i=0;i<nums1.length;i++)
        {
            a[i]=nums1[i];
        }
             for(int j=nums1.length;j<a.length;j++)
             {
                
                 a[j]=nums2[k];
                 k++;
                 
}
        Arrays.sort(a);
        int med;
int z=a.length/2;
        if(a.length%2==0)
        {
            med=(a[z]+(a[z-1]));
            median=med/2.0;
}
        else
        {
            median=a[z];
        }
        return median;
    }
}