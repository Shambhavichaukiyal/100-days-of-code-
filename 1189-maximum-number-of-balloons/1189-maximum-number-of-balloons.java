class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] a = new int[26];
        for (char b : text.toCharArray()) {
            int s = (int) b - 97;
            a[s] = a[s] + 1;
        }

        int o = 0;
        while (a[1] > 0 && a[0] > 0 && a[11] > 1 && a[14] > 1 && a[13] > 0) {
            a[1]--;  // b
            a[0]--;  // a
            a[11] -= 2;  // l
            a[14] -= 2;  // o
            a[13]--;  // n
            o++;
        }
        return o;
    }
}
