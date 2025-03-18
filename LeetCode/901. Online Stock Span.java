class StockSpanner {

    // Author : BlueCapture - { Yuvan }
    // Using monotonic Stack
    // Creating a Stack By Store the price and span 
    Stack<int[]> hash;

    public StockSpanner() {
        hash = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1; // Always initial span is equal to 1 {Bsc Current Day}
        while(!hash.isEmpty() && price >= hash.peek()[0])
        { 
            // Checking the Stack is empty and always peek ele should less then price 
            span += hash.peek()[1]; // Then increase the span back span
            hash.pop(); 
        }
        hash.push(new int[]{price,span}); // Push the element and span also
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
