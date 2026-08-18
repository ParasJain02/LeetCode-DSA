class Solution {
    public String decodeString(String s) {
        Deque<Integer> noStack =new ArrayDeque();
        Deque<Character> chrStack =new ArrayDeque();
        StringBuilder ans =new StringBuilder();

        char c;int k,i=0,x=0;

        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                while(Character.isDigit(s.charAt(i))){
                    x=x*10+s.charAt(i)-48;
                    i++;
                }
                    noStack.push(x);
                    x=0;
                continue;
            }else if(s.charAt(i)==']'){
                StringBuilder temp =new StringBuilder();
                while(chrStack.peek()!='['){
                    temp.append(chrStack.pop());
                }
                chrStack.pop();
                temp.reverse();
                k=noStack.pop();
                while(k!=0){
                    k--;
                for(int j=0;j<temp.length();j++){
                    chrStack.push(temp.charAt(j));
                }
                }
                
            }else{
                chrStack.push(s.charAt(i));
            }
            i++;
        }
        while(chrStack.peek()!=null){
            ans.append(chrStack.pollLast());
        }
        return ans.toString();
    }
}