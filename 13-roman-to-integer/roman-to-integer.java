class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        int curr,prev=0;

        for (int i = n-1; i >= 0; i--) {
            curr = getValue(s.charAt(i));
            if (i + 1 < n && curr < prev) {
                sum -= curr;
            } else {
                sum += curr;
            }
            prev=curr;
        }
        return sum;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}