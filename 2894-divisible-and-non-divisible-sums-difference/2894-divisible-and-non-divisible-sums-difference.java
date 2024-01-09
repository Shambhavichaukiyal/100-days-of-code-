class Solution {
    public int differenceOfSums(int n, int m) {
        int c=0;
        int d=0;
        for(int i=0;i<n+1;i++)
        {
            if(i%m==0)
            {
                c=c+i;
            }
            else{
                d=d+i;
            }
        }
        return d-c;
    }
}