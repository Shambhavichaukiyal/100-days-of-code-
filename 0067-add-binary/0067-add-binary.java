import java.math.BigInteger;

public class Solution {
    public static String addBinary(String a, String b) {
        BigInteger ss = new BigInteger(a, 2).add(new BigInteger(b, 2));
        return ss.toString(2);
    }
}
