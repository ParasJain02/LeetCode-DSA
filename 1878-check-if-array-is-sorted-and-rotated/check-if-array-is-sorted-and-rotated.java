class Solution {
    public boolean check(int[] nums) {
        int downCast=0;
        int last=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<last){
                downCast++;
            }
            last=nums[i];
        }
        return (downCast==1 && nums[0]>=nums[nums.length-1] ||downCast==0)?true:false;
    }
}