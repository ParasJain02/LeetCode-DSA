class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        //optimization
        int n=s.length(),m=p.length();
        List<Integer> res = new ArrayList<>();
        if(m>n) return res;
        //freq count
        int[] freq=new int[26];
        for(char c: p.toCharArray()){
            freq[c-'a']++;
        }
        //sliding window
        int left=0;
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
           //reduce char freq
            freq[c-'a']--;
            //if freq drops below 0 then shrink left
            while(freq[c-'a']<0){
                freq[s.charAt(left)-'a']++;
                left++;
            }
            //if window size is same as length then its valid
            if(right-left+1==m){
                res.add(left);
            }
        }
        return res;
    }
}