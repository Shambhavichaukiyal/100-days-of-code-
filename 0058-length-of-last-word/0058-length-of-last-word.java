import java.util.*;
class Solution {
    public int lengthOfLastWord(String s ) {
       
    
        String t=s.trim();
          String a[]=t.split(" ");
          int g=a.length-1;
       int l=a[g].length();
        return l;
        
    }
    public static void main(String args[])
    {
        Solution s = new Solution();
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(s.lengthOfLastWord(str));
    }
}