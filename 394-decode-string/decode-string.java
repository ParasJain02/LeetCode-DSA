class Solution {
    public String decodeString(String s) {
        return decode(s);
    }
    //Global integer i
    int i=0;


    private String decode(String s){

        StringBuilder cur=new StringBuilder();
        int num=0;

        while(i<s.length() && s.charAt(i)!=']'){
            //Caculate multi digit no
            if(Character.isDigit(s.charAt(i))){
                num=num*10+s.charAt(i)-'0';
            }
            //Inner String
            else if(s.charAt(i)=='['){
                i++;//skip'['
                String inner=decode(s);
                //Append num times
                for(int j=0;j<num;j++){
                    cur.append(inner);
                }
                //reset num
                num=0;
            }
            
            else{
                cur.append(s.charAt(i));
            }
            //increment i
             i++;              
        }
        return cur.toString();
    }
}