class Solution {
    public int addDigits(int num) {
        return addDigits(num,0);
    }
    public int addDigits(int num,int sum) {
        if(num==0){
            return (sum/10==0)?sum:addDigits(sum,0);
        }
        
        sum+=num%10;
        return addDigits(num/10,sum);
        
    }
}