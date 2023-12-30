class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numExchange == 0) {
            return numBottles;
        }

        int drink = numBottles;
        while (numBottles >= numExchange) {
            int exchangedBottles = numBottles / numExchange;
            numBottles = exchangedBottles + numBottles % numExchange;
            drink += exchangedBottles;
        }

        return drink;
    }
}
/*xyz*/