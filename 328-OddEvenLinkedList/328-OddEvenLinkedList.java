// Last updated: 5/25/2026, 9:01:26 PM
1class Solution 
2{
3    public int[] dailyTemperatures(int[] temperatures) 
4    {
5        int n = temperatures.length;
6        Stack<Integer> st = new Stack<>();
7        int[] temp = new int[n];
8        for(int i =0;i<n;i++)
9        {
10            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()])
11            {
12                int ind = st.pop();
13                temp[ind] = i - ind;
14            }
15            st.push(i);
16        }
17        return temp;
18    }
19}