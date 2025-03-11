class CustomStack {
    int top = -1;
    int a[];
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        a = new int[maxSize];
    }
    
    public void push(int x) {
        if(top == maxSize -1)
        return;

        a[++top] = x;
    }
    
    public int pop() {
        if(top < 0)
        return -1;
        
        return a[top--];
    }
    
    public void increment(int k, int val) {
        int min = Math.min(k,maxSize);
        for(int i = 0;i<min ;i++)
        {
            a[i] = a[i] + val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
