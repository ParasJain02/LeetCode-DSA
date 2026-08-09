class Solution {
    public int findMin(int[] nums) {
       int low=0,high=nums.length-1,mid,min=nums[0];

       while(low<=high){
        mid=(high-low)/2+low;

        if(nums[mid]<min){min=nums[mid];}


        if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
            low++;high--;
            continue;
        }

        
        if(nums[mid]>=nums[low]){
            if(nums[low]<min){
                min=nums[low];
               
            }
            low=mid+1;
        }else{
            high=mid-1;
        }

       } 
       return min;
    }
}