// Last updated: 2/13/2026, 3:15:42 PM
class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[n];
        for(int i =0;i<n;i++)
        {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()])
            {
                int ind = st.pop();
                temp[ind] = i - ind;
            }
            st.push(i);
        }
        return temp;
    }
}