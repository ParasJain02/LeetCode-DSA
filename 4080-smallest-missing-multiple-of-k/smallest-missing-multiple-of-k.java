class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        for(int i=k;i<=100;i=i+k){
            if(!(set.contains(i))){
                return i;
            }
        }
        return 100+k-(100%k);
    }
}