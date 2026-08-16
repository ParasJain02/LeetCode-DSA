class Solution {
    public String reverseWords(String s) {
        char[] c= s.toCharArray();
        int n= c.length;

        int i=0,strt=0;
        while(i<n){
            if(c[i]!=' '){
                strt=i;
                while(i<n && c[i]!=' '){i++;}
                reverse(c,strt,i-1);
            }
            i++;
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