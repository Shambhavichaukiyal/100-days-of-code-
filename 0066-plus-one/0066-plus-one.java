class Solution {
    public int[] plusOne(int[] digits) {
        int o =digits.length;
         int a[]= new int[digits.length+1];
        for (int i=o-1; i>= 0; i--) {
	if (digits[i]<9) {
		digits[i]=digits[i]+1;
		return digits;
	}
	digits[i]=0;
}
a[0]=1;
return a;
    }
}