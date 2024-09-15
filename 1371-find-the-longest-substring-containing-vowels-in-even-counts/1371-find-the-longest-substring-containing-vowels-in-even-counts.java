class Solution {
    public int findTheLongestSubstring(String s) {
       HashMap<Character,Integer> vowel= new HashMap<>();
        vowel.put('a',0);
        vowel.put('e',1);
        vowel.put('i',2);
        vowel.put('o',3);
        vowel.put('u',4);
        HashMap<Integer,Integer> m= new HashMap<>();
        m.put(0,-1);
        int maxlength=0;
        int mask=0;
        for(int i=0;i<s.length();i++)
        {
        char ch=s.charAt(i);
            if(vowel.containsKey(ch))
            {
                int bit=vowel.get(ch);
                mask^=(1<<bit);
}
            if(m.containsKey(mask))
            {
                maxlength=Math.max(maxlength,i-m.get(mask));
            }
            else
            {
                m.put(mask,i);
            }
        }
        return maxlength;
    }
}