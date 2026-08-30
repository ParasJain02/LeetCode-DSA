class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> seen =new HashMap<>();
        // we create Integer object so that we can compare it with null , we cant just compare null and int
        Integer prev;
        
        for(int i=0;i<nums.length;i++){
            prev=seen.get(target-nums[i]);
            if(prev!=null)return new int[]{i,prev};
            seen.put(nums[i],i);
        }
        return new int[]{};
    }
}