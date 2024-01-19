class Solution {
    public int mostWordsFound(String[] sentences) {
        int a[]=new int[sentences.length];
        int c;
        int n=sentences.length;
        for(int i=0;i<sentences.length;i++)
        {
             c=1;
            for(int j=0;j<sentences[i].length();j++)
        {
            if(sentences[i].charAt(j)==' ')
            {
                c++;
            }
        }
            a[i]=c;
        }
               Arrays.sort(a);
        return a[n-1];
        
    }
}