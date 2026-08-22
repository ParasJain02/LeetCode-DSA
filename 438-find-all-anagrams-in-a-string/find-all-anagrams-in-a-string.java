class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();

        if(m>n){return new ArrayList<>();}

        Map<Character,Integer> pMap=new HashMap<>();
        for(char c:p.toCharArray()){
            pMap.put(c,pMap.getOrDefault(c,0)+1);
        }


        int i=0,j=-1;
        List<Integer> ans=new ArrayList<>();

        while(i<n-m+1){
            while(j<n-1 && j-i+1<m){
                j++;
                pMap.put(s.charAt(j),pMap.getOrDefault(s.charAt(j),0)-1);
                if(pMap.get(s.charAt(j))==0){
                    pMap.remove(s.charAt(j));
                }
            }

            if(pMap.isEmpty()){
                ans.add(i);                
            }
            
            pMap.put(s.charAt(i),pMap.getOrDefault(s.charAt(i),0)+1);
            if(pMap.get(s.charAt(i))==0){
                pMap.remove(s.charAt(i));
            }
            i++;
            

        }
        return ans;
    }
}