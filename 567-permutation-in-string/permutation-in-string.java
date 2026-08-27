class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length(),m=s1.length();
        if(m>n)return false;

         int[] freq=new int[26];
        for(char c: s1.toCharArray()){
            freq[c-'a']++;
        }
        int count=m;

        int left=0;
        for(int right=0;right<n;right++){
            char c=s2.charAt(right);

            if(freq[c-'a']>0){
                count--;
            }
            freq[c-'a']--;

            if(right-left+1==m){
                if(count==0)return true;
                else{
                    if(freq[s2.charAt(left)-'a']>=0){
                        count++;
                    }
                    freq[s2.charAt(left)-'a']++;
                    left++;
                }
            }


        }
        return false;
    }
}