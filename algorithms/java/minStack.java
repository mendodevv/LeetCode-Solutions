class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        min = Math.min(min, value);
        minStack.push(min);
        stack.push(value);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();

        if(minStack.peek() != null){
            min = minStack.peek();
        } else {min = Integer.MAX_VALUE;}

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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
