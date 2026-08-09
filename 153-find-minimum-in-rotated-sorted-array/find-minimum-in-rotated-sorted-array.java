class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1,mid,root=nums[0];
        while(low<=high){
            mid=(high-low)/2 + low;
            if(nums[mid]<nums[0]){
                root=nums[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return root;
    }
}