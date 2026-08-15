class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        int[] ptrn=new int[26];
        Map<String,Integer> words=new HashMap<>();
        String[] word=s.split(" ");
        if(word.length!=pattern.length()){return false;}
        char c;
        String w;
        for(int i=0;i<pattern.length();i++){
            c=pattern.charAt(i);
            w=word[i];
            if(ptrn[c-'a']!=words.getOrDefault(w,0)){
                return false;
            }
            ptrn[c-'a']=i+1;
            words.put(w,i+1);
        }
        return true;
    }
}