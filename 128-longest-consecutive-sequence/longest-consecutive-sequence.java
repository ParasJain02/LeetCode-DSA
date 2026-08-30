class Solution {
    public int longestConsecutive(int[] nums) {
        // we initialise set with nums size /0.75 to prevent dynamic size inc and load factor is 0.75 so to overcome that we divided it by 0.75
       Set<Integer> seen =new HashSet<>((int)(nums.length/0.75f)+1);


       //Add all elements in set
       for(int i:nums)seen.add(i); 


       // for every unique element in that set
       int max=0;
       int prev,next;
       for(int i:nums){//duplicate exist in nums  
        if(seen.remove(i)){

         prev=i-1;
         next=i+1;
        // calculate chain size
        while(seen.remove(prev))prev--;
        while(seen.remove(next))next++;
            
        
        //update max 
        max=Math.max(max,next-prev-1);
        }
       } 
       return max;
    }

}