class Solution {
    public int trap(int[] height) {
        int leftmax=0,rightmax=0,left=0,right=height.length-1,sum=0;
        while(left<right){
            if(height[left]<height[right]){
                leftmax=Math.max(leftmax,height[left]);
                sum+=leftmax-height[left];
                left++;
            }else{
                rightmax=Math.max(rightmax,height[right]);
                sum+=rightmax-height[right];
                right--;
            }
        }
        return sum;

    }
}