class Solution {
    public int maximum69Number (int num) {
        String st = Integer.toString(num);
        char[] chars = st.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                return Integer.parseInt(new String(chars));
            }
        }
        
        return num;
    }
}
