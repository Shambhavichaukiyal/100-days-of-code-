class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
     Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int l=0;
        int r=0;
        int c=0;
        while(r<m  && l < n)
        {
            if(g[l]<=s[r])
            {
                l++;
                c++;
            }
            r++;
        }
        return c;
    }
}