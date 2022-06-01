class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        if(s1.size()==0)
        {
            s1.push(x);
        }
        else{
            move(s1,s2);
            s1.push(x);
            move(s2,s1);
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.size()==0){
            return true;
        }
        return false;
    }
    
    public static void move(Stack a,Stack b)
    {
        while(a.size()!=0)
        {
            b.push(a.pop());
        }
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