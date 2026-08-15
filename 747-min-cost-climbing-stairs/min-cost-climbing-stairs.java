class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int currentMin=0,prev1=cost[1],prev2=cost[0],i=2;
        while(i<cost.length){
            currentMin=cost[i]+Math.min(prev1,prev2);
        prev2=prev1;
        prev1=currentMin;
            i++;
        }
        return Math.min(prev1,prev2);
    }
}