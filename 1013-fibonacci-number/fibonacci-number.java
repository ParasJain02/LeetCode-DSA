class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int last=1;
        int secondLast=0;
        int current=0;
        for(int i=2;i<=n;i++){
            current=secondLast+last;
            secondLast=last;
            last=current;
        }
        return current;
    }
}