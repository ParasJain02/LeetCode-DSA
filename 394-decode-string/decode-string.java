class Solution {
    public String decodeString(String s) {
        Deque<Integer> no=new ArrayDeque<>();
        Deque<StringBuilder> str=new ArrayDeque<>();
        StringBuilder cur=new StringBuilder();
        int n=s.length();
        int num=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+c-'0';
            }else if(c=='['){
                no.push(num);
                num=0;
                str.push(cur);
                cur=new StringBuilder();
            }else if(c==']'){
                int k=no.pop();
                StringBuilder prev=str.pop();
                for(int i=0;i<k;i++){
                    prev.append(cur);
                }
                cur=prev;
            }else{
                cur.append(c);
            }
        }
        return cur.toString();
    }
}