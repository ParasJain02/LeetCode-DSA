class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            //== has higher precedence
            if((n & 1)==1)count++;
            //>>> is unsigned right shift
            //>> signed right shift
            n=n>>1;
        }
        return count;
    }
}