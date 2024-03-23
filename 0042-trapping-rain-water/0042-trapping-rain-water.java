class Solution {
    public int trap(int[] height) {
     int len = height.length;

        int[] maxL = new int[len];
        int max =0;
        for(int i=0; i<len; i++){
            max = Math.max(max,height[i]);
            maxL[i] = max;
        }

       
        int[] maxR = new int[len];
        max =0;
        for(int i=len-1; i>=0; i--){
            max = Math.max(max,height[i]);
            maxR[i] = max;
        }

        // Here Calculate Water Lavel
        int waterLevelStore = 0;
        for(int i=0; i<len; i++){
            int min = Math.min(maxL[i],maxR[i]);
            waterLevelStore += min-height[i];
        }
        return waterLevelStore;
}}