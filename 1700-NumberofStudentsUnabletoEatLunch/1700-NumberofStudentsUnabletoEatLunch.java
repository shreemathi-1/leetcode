// Last updated: 3/26/2026, 9:24:09 AM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) 
3    {
4        Queue<Integer> q = new LinkedList<>();
5        Stack<Integer> st = new Stack<>();
6        int rej =0;
7         for(int i =sandwiches.length-1;i>=0;i--)
8        {
9            st.push(sandwiches[i]);
10        }
11        for(int i =0;i<students.length;i++)
12        {
13            q.add(students[i]);
14        }
15        while(!st.isEmpty() && !q.isEmpty())
16        {
17            if(st.peek() == q.peek())
18            {
19                st.pop();
20                q.remove();
21                rej =0;
22            }
23            else
24            {
25                q.add(q.remove());
26                rej++;
27                if(rej == q.size())
28                {
29                    return q.size();
30                }
31            }
32        }
33        return q.size();
34    }
35}