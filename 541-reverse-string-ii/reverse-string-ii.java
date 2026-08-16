class Solution {
    public String reverseStr(String s, int k) {
        char[] c=s.toCharArray();
        int n=c.length;

        int i=0;
        while(i<n){
            if(i+k-1<n){
                reverse(c,i,i+k-1);
            }else{
                reverse(c,i,n-1);
            }
            i+=2*k;
        }
        return new String(c,0,n);
    }
    public static void reverse(char[] c,int i,int j){
        char t;
        while(i<j){
            t=c[i];
            c[i]=c[j];
            c[j]=t;
            i++;j--;
        }
    }
}