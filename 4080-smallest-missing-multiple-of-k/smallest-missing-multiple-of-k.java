class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] arr=new int[101+k];

        for(int i:nums){
            arr[i]=1;
        }

        for(int i=k;;i+=k){
            if(arr[i]!=1){
                return i;
            }
        }
    }
}