class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n,digit,sum=0,product=1;
        while(temp>0){
            digit=temp%10;
            sum+=digit;
            product=product*(digit);
            temp=temp/10;
        }
        if(n%(sum+product)==0){return true;}
        else{return false;}
    }
}