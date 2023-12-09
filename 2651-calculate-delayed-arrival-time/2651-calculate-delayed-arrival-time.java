class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) 
    {
       int s= arrivalTime+delayedTime;
        while(s>23)
        {
            s=s-24;
        }
        return s;
    }
}