class Solution 
{
    public int myAtoi(String s)
    {
        s = s.trim();
        
        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int i = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        long num = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;

            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (num * sign);
    }
}
