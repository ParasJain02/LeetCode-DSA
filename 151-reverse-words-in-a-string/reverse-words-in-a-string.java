class Solution {
    public String reverseWords(String s) {
        char[] c=s.toCharArray();
        int n=c.length;

        reverse(c,0,n-1);

        int i=0,idx=0,strt;
        while(i<n){
            if(c[i]!=' '){
                strt=i;
                while(i<n && c[i]!=' '){i++;}
                reverse(c,strt,i-1);
                if(idx!=0) c[idx++]=' ';
                while(strt<i) c[idx++]=c[strt++];
            }
            i++;
        }
        return new String(c,0,idx);
    }

    public static void reverse(char[] c,int strt,int end){
        char temp;
        while(strt<end){
            temp=c[strt];
            c[strt]=c[end];
            c[end]=temp;
            strt++;end--;
        }
        return;
    }
}