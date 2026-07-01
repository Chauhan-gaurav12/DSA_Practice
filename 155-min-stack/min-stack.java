class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.isEmpty() || minStack.peek() >= value)// isme hm check kar rhe hai ki minstack ke peek pe jo value hai bo agr new value se big hai to hm aane bali value ko minimum let karenge
            minStack.push(value); 
    }
    
    public void pop() {
        if(st.peek()<=minStack.peek())// agr minstack value me stack me same value hai to hme minstack se remove karna padega
            minStack.pop();
        st.pop();
          
    }
    
    public int top() {
        return st.peek();
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