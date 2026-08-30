class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> seen =new HashSet<>();
       int max=0;
       //Add all elements in set
       for(int i:nums){
        seen.add(i);        
       } 
       // for every unique element in that set
       for(Integer i:seen){  
        int cnt=1; 
        // if element is not a start of chain  
        if(seen.contains(i-1))continue;  
        // calculate chain size
        while(seen.contains(i+1)){
            cnt++;
            i=i+1;
        }
        //update max 
        max=Math.max(max,cnt);
       } 
       return max;
    }

}