class StockSpanner {
    Stack<Pair<Integer,Integer>>st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!st.isEmpty()&&st.peek().getKey()<=price)
            span+=st.pop().getValue();
        st.push(new Pair(price,span));
        return span;      
    }
}