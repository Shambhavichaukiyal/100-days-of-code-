class Solution {
    public boolean stoneGame(int[] piles) {
      int[] d = new int[piles.length];
        for(int i = piles.length - 1; i >= 0; i--) {
            for(int j = i; j < piles.length; j++) {
                if(i == j) {
                    d[i] = piles[i];
                } else {
                    d[j] = Math.max(piles[i] - d[j], piles[j] - d[j-1]);
                }
            }
        }
        return d[piles.length-1] >= 0;
    }
}