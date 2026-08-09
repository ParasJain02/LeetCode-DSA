class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid,root=0,idx=-1;
        while(low<=high){
            mid=(high-low)/2+low;
            if(nums[mid]<nums[0]){
                root=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(target>=nums[0]){
            root=(root==0)?nums.length:root;
            idx=Arrays.binarySearch(nums,0,root,target);
        }else{
            idx=Arrays.binarySearch(nums,root,nums.length,target);
        }
        return (idx<0)?-1:idx;
    }

}