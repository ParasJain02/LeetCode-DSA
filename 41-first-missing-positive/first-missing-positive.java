class Solution {
    public int firstMissingPositive(int[] nums) {
        //take each element and place it at its correct position 
        //place 1 at index 0
        //place 2 at index 1
        for(int i=0;i<nums.length;i++){
            //Repeat placing i at correct position until
            while(
                //nums[i] gets -ve or
                nums[i]>0 && 
                //nums[i] gets out of range or
                nums[i]-1<nums.length && 
                //nums[i] gets duplicate or already at its position
                nums[i]!=nums[nums[i]-1])
                {
                    swap(nums,i,nums[i]-1);
                }
        }
        //Check which element starting from 1 is missing
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        //return n+1 in case [1,2,3]
        return nums.length+1;
    }

    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}