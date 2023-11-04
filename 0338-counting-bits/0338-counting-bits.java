class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            int c = 0;
            for (int j = 0; j < s.length(); j++) {
                char h = s.charAt(j);
                c = c + Character.getNumericValue(h); // or c = c + (h - '0');
            }
            result[i] = c;
        }
        return result;
    }
}
