class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();

        if(n>m)return "";

        int[] freq=new int[58];
        //store freq of char in t
        for(char c:t.toCharArray()){
            freq[c-'A']++;
        }

        int count=n,left=0;
        String ans=s+s;
        //right moves 1 step everytime
        for(int right=0;right<m;right++){
            char c=s.charAt(right);
            // track count(no of chars req in s to form c)
            if(freq[c-'A']>0){
                count--;
            }
            freq[c-'A']--;
            //shrink from left 
            if(count==0 && right-left+1>=n){
                //remove all useless chars
                while(left<right && freq[s.charAt(left)-'A']+1<=0){
                    freq[s.charAt(left)-'A']++;
                    left++;
                }
                //note its length
                if(ans.length()>right-left+1){
                    ans=s.substring(left,right+1);
                }
            }
        }
        //one thing to visualise is once count hits 0 it remains 0 forever because in that window it found every char it needed ,,,,, now windows expands right and shrink left happens only when there is an extra char that is determined by freq array not with count

        return ans.equals(s+s)?"":ans;
    }
}