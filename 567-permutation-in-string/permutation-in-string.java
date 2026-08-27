class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //optimization
        int n=s2.length(),m=s1.length();
        if(m>n)return false;
        //freq count
        int[] freq=new int[26];
        for(char c: s1.toCharArray()){
            freq[c-'a']++;
        }
        //sliding window
        int left=0;
        for(int right=0;right<n;right++){
            char c=s2.charAt(right);
           //reduce char freq
            freq[c-'a']--;
            //if freq drops below 0 then shrink left
            while(freq[c-'a']<0){
                freq[s2.charAt(left)-'a']++;
                left++;
            }
            //if window size is same as length then its valid
            if(right-left+1==m){
                return true;
            }
        }
        return false;
    }
}