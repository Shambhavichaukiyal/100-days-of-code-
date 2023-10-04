import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int n,rem,s;
        n=x;
         s=0;
        while(n>0) 
        {
            rem=n%10;
            s=s*10+rem;
            n=n/10;

        }
        if(s==x)
        return true;
        else
        {
          return false;  
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        Solution sol= new Solution();
        boolean t=sol.isPalindrome(a);
        System.out.println(t);
    }

}