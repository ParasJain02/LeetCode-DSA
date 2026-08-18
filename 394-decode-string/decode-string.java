class Solution {
    public String decodeString(String s) {
        Deque<Integer> noStack =new ArrayDeque();
        Deque<Character> chrStack =new ArrayDeque();
        StringBuilder ans =new StringBuilder();

        char c;int k,i=0;

        while(i<s.length()){
            c=s.charAt(i);
            if(Character.isDigit(c)){
                noStack.push(c-48);
                i++;
                while(Character.isDigit(s.charAt(i))){
                    noStack.push(noStack.pop()*10+s.charAt(i)-48);
                    i++;
                }
                continue;
            }else if(c==']'){
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
                chrStack.push(c);
            }
            i++;
        }
        while(chrStack.peek()!=null){
            ans.append(chrStack.pollLast());
        }
        return ans.toString();
    }
}