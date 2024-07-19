class MyQueue {
Stack<Integer> sta1 = new Stack<>();
    Stack<Integer> sta2 = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        sta1.push(x);
    }
    
    public int pop() {
      
             if (sta2.isEmpty()) {
            while (!sta1.isEmpty()) {
                sta2.push(sta1.pop());
            }
        }
        return sta2.pop();
    }
    
    
    public int peek() {
                    if (sta2.isEmpty()) {
            while (!sta1.isEmpty()) {
                sta2.push(sta1.pop());
            }
        }
        return sta2.peek();
    }
    

    public boolean empty() {
        return sta1.isEmpty() && sta2.isEmpty();
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