class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String c : operations) {
            if(c.charAt(1) == '-') x--;
            else x++;
        }
        return x;
    }
}