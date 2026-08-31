class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Boyer Moore Vote Algo for 2 candidates
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();

        int candidate1=0;
        int candidate2=0;
        int vote1=0;
        int vote2=0;

        for(int i:nums){
            if(i==candidate1)vote1++;
            else if(i==candidate2)vote2++;
            else if(vote1==0){
                candidate1=i;
                vote1++;
            }else if(vote2==0){
                candidate2=i;
                vote2++;
            }else{
                vote1--;
                vote2--;
            }
        }
        //Pass 2 Recheck if candidate actually wins and is not duplicate
        vote1=0;
        vote2=0;
        for(int i:nums){
            if(i==candidate1)vote1++;
            else if(i==candidate2)vote2++;
        }
        //add to ans
        if(vote1>n/3)ans.add(candidate1);
        if(vote2>n/3 && candidate1!=candidate2)ans.add(candidate2);
        
        return ans;
    }
}