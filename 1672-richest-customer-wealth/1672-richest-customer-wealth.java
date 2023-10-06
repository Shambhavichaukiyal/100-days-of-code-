import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i[]:accounts)
        { 
            int m=0;
            for(int j:i) 
            {
              m=m+j;  
            }
            if(max<m)
            {
                max=m;
            }
        }
        return max;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) 
            {
                a[i][j]=sc.nextInt();
            }
        }
        Solution s =  new Solution();
        System.out.println(s.maximumWealth(a));
        
    }
        
}