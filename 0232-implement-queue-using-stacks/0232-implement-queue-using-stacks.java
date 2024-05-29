class MyQueue {
private Stack<Integer> sta1;
    private Stack<Integer> sta2;
    public MyQueue() {
        sta1= new Stack<>();
        sta2=new Stack<>();
    }
    
    public void push(int x)
    {
        sta1.push(x);
    }
    
    public int pop() 
    {
        if(sta2.empty())
        {
            transfer();
        }
        if(sta2.empty())
        {
            return -1;
        }
        return sta2.pop();

    }
    
    public int peek() {
        
        if(sta2.empty())
        {
            transfer();
        }
        if(sta2.empty())
        {
            return -1;
        }
        return sta2.peek();

    }
    
    public boolean empty()
    {
        return (sta1.empty() && sta2.empty());
    }
    private void transfer() {
        while (!sta1.isEmpty()) {
            sta2.push(sta1.pop());
        }
}}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */