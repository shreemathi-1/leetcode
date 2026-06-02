// Last updated: 6/2/2026, 9:52:50 PM
1class StockSpanner {
2
3Stack<int[]> st;
4    public StockSpanner() {
5        st = new Stack<>();
6    }
7    
8    public int next(int price) {
9        int span =1;
10        while(!st.isEmpty() && price >= st.peek()[0])
11        {
12            span += st.peek()[1];
13            st.pop();
14        }
15        st.push(new int[]{price,span});
16        return span;
17    }
18}
19
20/**
21 * Your StockSpanner object will be instantiated and called as such:
22 * StockSpanner obj = new StockSpanner();
23 * int param_1 = obj.next(price);
24 */