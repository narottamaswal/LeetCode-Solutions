class MyStack {
    private Deque<Integer> stack = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);        
    }
    
    public int pop() {
        if(!this.empty()){
            int o = stack.peek();
            stack.pop();
            return o;
        }
        return -1;
    }
    
    public int top() {
        if(!this.empty()){
            return stack.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */