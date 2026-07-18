class MyStack {
    Queue<Integer> qq=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
      qq.add(x);  
    }
    
    public int pop() {
       for(int i=0;i<qq.size()-1;i++){
            qq.add(qq.remove());
       }
       return qq.remove();
    }
    
    public int top() {
        for(int i=0;i<qq.size()-1;i++){
            qq.add(qq.remove());
        }  
        int x=qq.remove();
        qq.add(x);
        return x;
    }
    
    public boolean empty() {
        if(qq.size()<=0)
            return true;
        else
            return false;
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