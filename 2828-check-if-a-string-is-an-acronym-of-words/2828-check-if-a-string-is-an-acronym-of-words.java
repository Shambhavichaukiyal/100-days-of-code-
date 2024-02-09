class Solution {
    public boolean isAcronym(List<String> words, String s) 
    {
        String str="";
        for(String i:words){
            str=str+i.charAt(0);
        }
        if(str.equals(s))
        {
            return true;
            }
        return false;
}
    }
