class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String d="";
        for(int i=0;i<k;i++)
        {
            d=d+str[i]+" ";
        }
       String f= d.trim();
        return f;
    }
}