class Solution {
    public int[] replaceElements(int[] arr) {
        int a[]=new int[arr.length];
        int s=0;
        while(s<arr.length-1)
        {
            int max=0;
            for(int i=s+1;i<arr.length;i++)
            {
                if(max<=arr[i])
                {
                    max=arr[i];
                }
            }
            a[s]=max;
            s++;
        }
         a[arr.length-1]=-1;
        
        return a;
    }}
       