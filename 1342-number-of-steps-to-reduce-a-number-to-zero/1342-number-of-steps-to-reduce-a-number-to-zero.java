import java.util.*;
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0)
        { 
            if(num%2==0)
            {
             num=num/2;
                c=c+1;
                
            }
            else 
            {
            num=num-1;
                c=c+1;
        }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.println(s.numberOfSteps(n));
        
    }
}