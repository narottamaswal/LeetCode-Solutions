class MinStack {
    Deque<Pair<Integer,Integer>> dq;
    public MinStack() {
        dq = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(dq.isEmpty()){
            dq.push(new Pair(val,val));
        }else{
            int top = dq.peek().getValue();
            int c = Math.min(top,val);
            dq.push(new Pair(val,c));
        }
    }
    
    public void pop() {
        dq.poll();
    }
    
    public int top() {
        return dq.peek().getKey();   
    }
    
    public int getMin() {
        return dq.peek().getValue();           
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */