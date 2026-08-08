class Solution {
    public int myAtoi(String s) {
        int i=0,n=s.length();
        int ans=0;
        int sign=1;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n){
            if(s.charAt(i)=='-'){
                sign=-1;
                i++;
            }else if(s.charAt(i)=='+'){
                i++;
            }
        }
        while(i!=n && Character.isDigit(s.charAt(i))){
            if(ans>Integer.MAX_VALUE/10|| (ans==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7)){return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;}
            ans=ans*10+ (s.charAt(i)-'0');
           
            i++;
        }
        return sign*ans;
    }
}