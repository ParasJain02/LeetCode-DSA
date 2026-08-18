class MinStack {
    List<Integer> arr;
    List<Integer> min;
    int top;

    public MinStack() {
        this.top=-1;
        arr=new ArrayList<>();
        min=new ArrayList<>();
    }
    
    public void push(int value) {
        top++;
        arr.add(value);
        if(top==0){
        min.add(value) ;
        } else{


         min.add(Math.min(min.get(top-1),value));
        }
    }
    
    public void pop() {      
        arr.remove(top);
        min.remove(top);
        top--;
    }
    
    public int top() {
        return arr.get(top);
    }
    
    public int getMin() {
        return min.get(top);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */