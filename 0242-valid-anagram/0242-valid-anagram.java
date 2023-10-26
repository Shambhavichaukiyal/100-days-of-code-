import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] str = s.toCharArray();
        char[] ftr = t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(ftr);

        
        return Arrays.equals(str, ftr);
    }
}
