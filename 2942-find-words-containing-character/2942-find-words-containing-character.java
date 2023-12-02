class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int l=words.length;
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<l;i++)
        {
          for(int j=0;j<words[i].length();j++) 
          {
              if(x==words[i].charAt(j))
              {
                  a.add(i);
                  break;
              }
          }
        }
      return a;  
    }
}