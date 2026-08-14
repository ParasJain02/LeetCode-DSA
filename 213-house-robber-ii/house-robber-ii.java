class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    public int rob(int[] nums,int strt,int end) {
        int prev1=0,prev2=0,currentMax=0;
        for(int i=strt;i<=end;i++){
            currentMax=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=currentMax;
        }
        return prev1;
    }
}