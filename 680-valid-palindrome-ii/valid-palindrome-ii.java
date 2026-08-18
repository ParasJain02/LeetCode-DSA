class Solution {
    public boolean validPalindrome(String s) {
        char[] c=s.toCharArray();
        int i=0,j=c.length-1;
        while(i<j){
            if(c[i]!=c[j]){
                return isPalindrome(c,i+1,j)|| isPalindrome(c,i,j-1);
            }
            i++;j--;
        } 
        return true;   
    }
    public static boolean isPalindrome(char[] c,int i,int j){
        while(i<j){
            if(c[i]!=c[j]){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}