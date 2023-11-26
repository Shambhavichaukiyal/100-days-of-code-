class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int l = a.length - 1;

        while (i < l) {
            if (Character.isLetter(a[i]) && Character.isLetter(a[l])) {
                char t = a[i];
                a[i] = a[l];
                a[l] = t;
                i++;
                l--;
            } else if (!Character.isLetter(a[i])) {
                i++;
            } else {
                l--;
            }
        }

        return new String(a);
    }
}
