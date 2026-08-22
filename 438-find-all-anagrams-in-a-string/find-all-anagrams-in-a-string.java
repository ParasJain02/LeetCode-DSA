class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();

        if(m>n){return new ArrayList<>();}

        int[] freq= new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }


        int left=0,count=m;
        List<Integer> ans=new ArrayList<>();

        for(int right=0; right<n; right++){
            if(freq[s.charAt(right)-'a']>0){
                count--;
            }
            freq[s.charAt(right)-'a']--;

            if(right-left+1==m){
                if(count==0){
                    ans.add(left);
                }
                freq[s.charAt(left)-'a']++;
                if(freq[s.charAt(left)-'a']>0){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}