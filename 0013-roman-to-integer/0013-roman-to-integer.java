import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> sd = new HashMap<>();
        sd.put('I', 1);
        sd.put('V', 5);
        sd.put('X', 10);
        sd.put('L', 50);
        sd.put('C', 100);
        sd.put('D', 500);
        sd.put('M', 1000);
        int h = 0;
        int p = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = sd.get(s.charAt(i));
            if (c < p) {
                h = h - c;
            } else {
                h = h + c;
            }
            p = c;
        }
        return h;
    }
}
