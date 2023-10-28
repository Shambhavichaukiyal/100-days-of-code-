class Solution {
    public void reverseString(char[] r) {
        char temp;
        for(int i=0;i<r.length/2;i++)
        {
            temp =r[i];
            r[i]=r[r.length-1-i];
            r[r.length-1-i]=temp;
        }
        
        
    }
}