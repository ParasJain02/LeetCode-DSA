class Solution {
    public boolean isIsomorphic(String ss, String tt) {
     int[] mapS=new int[256];
     int[] mapT=new int[256];
     char[] s=ss.toCharArray();
     char[] t=tt.toCharArray();
     for(int i=0;i<ss.length();i++){
        if(mapS[s[i]]==0 && mapT[t[i]]==0){
            mapS[s[i]]=t[i];
            mapT[t[i]]=s[i];
        }else{
            if(!(mapS[s[i]]==t[i] && mapT[t[i]]==s[i])){
                return false;
            }
        }
     }  
     return true; 
    }
}