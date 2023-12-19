class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String a:details)
        {
        String d=a.substring(11,13);
        int f=Integer.parseInt(d);
        if(f>60)
        {
            c++;
        }
        
    }
        return c;
}}