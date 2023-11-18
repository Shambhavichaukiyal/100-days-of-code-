class Solution {
    public int countSegments(String s) {
         String str=s.trim();
        if(str.isEmpty())
        {
            return 0;
        }
       String a[]=str.split("\\s+");
    
        return a.length;
    }}