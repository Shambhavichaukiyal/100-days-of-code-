import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String str=s.trim();
        String g="";
         
       String p[]=str.split("\\s+");
        for(int i=p.length-1;i>0;i--)
        {
            g=g+p[i]+" ";
}
        g=g+p[0];
      return g; 
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
Solution s = new Solution();
    System.out.println(s.reverseWords(str1));
    }
}
    