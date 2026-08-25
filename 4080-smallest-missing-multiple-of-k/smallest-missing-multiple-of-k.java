class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] arr=new int[101];

        for(int i:nums){
            arr[i]=1;
        }

        for(int i=k;i<=100;i=i+k){
            if(arr[i]!=1){
                return i;
            }
        }
        return 100+k-(100%k);
    }
}