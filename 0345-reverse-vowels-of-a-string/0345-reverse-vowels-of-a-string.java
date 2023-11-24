public class Solution {
    public String reverseVowels(String st) {
        int l = st.length() - 1;
        int s = 0;
        char[] chars = st.toCharArray();

        while (l > s) {
            char ch = chars[l];
            char sh = chars[s];

            if (isVowel(ch) && isVowel(sh)) {
                // Swap vowels
                char temp = chars[l];
                chars[l] = chars[s];
                chars[s] = temp;

                // Move indices
                l--;
                s++;
            } else if (isVowel(ch)) {
                // Move start index
                s++;
            } else {
                // Move end index
                l--;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
