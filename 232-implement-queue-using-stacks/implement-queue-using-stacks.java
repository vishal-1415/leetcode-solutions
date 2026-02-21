class MyQueue {
    private Stack<Integer> FirstStack = new Stack<>();
    private Stack<Integer> SecondStack = new Stack<>();

    public MyQueue() {
    }
    
    public void push(int x) {
        FirstStack.push(x);
    }
    
    public int pop() {
        peek();
        return SecondStack.pop();
    }
    
    public int peek() {
        if(SecondStack.empty()){
            while(!FirstStack.empty()){
                SecondStack.push(FirstStack.pop());
            }
        }
        return SecondStack.peek();
    }
    
    public boolean empty() {
        return FirstStack.empty() && SecondStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */