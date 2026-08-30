class Solution {
    public int majorityElement(int[] nums) {
        //Boyer Moore Majority Vote Algorithm

        //intution- element apprearing N/2+ times has freq greater then all other combined

        int majority=nums[0];
        int votes=0;
        for(int i:nums){
            if(i==majority){
                votes++;  
            } 
            else if(votes==0){
                majority=i;
                votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
}