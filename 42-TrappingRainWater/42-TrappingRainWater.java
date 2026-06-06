// Last updated: 6/6/2026, 12:25:06 PM
1class Solution {
2    public int trap(int[] height) {
3        if(height == null || height.length <3)
4        {
5            return 0;
6        }
7        Stack<Integer> st = new Stack<>();
8        st.push(height[height.length-1]);
9        int leftMax= height[0];
10        int water =0;
11        for(int i = height.length -2 ;i>=2;i--)
12        {
13            st.push(Math.max(height[i],st.peek()));
14        }
15        for(int i =1; i< height.length-1;i++)
16        {   
17             int minHeight = Math.min(leftMax,st.peek());
18             water += Math.max(0,minHeight - height[i]);
19             st.pop();
20             leftMax = Math.max(leftMax,height[i]);
21        }   
22        return water;
23    }
24}