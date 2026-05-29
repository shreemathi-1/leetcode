// Last updated: 5/29/2026, 2:59:37 PM
1class Solution 
2{
3    public boolean canFinish(int numCourses, int[][] prerequisites) 
4    {
5        int completed =0;
6        int[] indegree = new int[numCourses];
7        List<List<Integer>> adj = new ArrayList<>();
8        for(int i =0;i<numCourses;i++)
9        {
10            adj.add(new ArrayList<>());
11        }
12        for(int[] pre: prerequisites)
13        {
14            int prerequisite =pre[1];
15            int course = pre[0];
16            adj.get(prerequisite).add(course);
17            indegree[course]++;
18        }
19         Queue<Integer> q = new LinkedList<>();
20         for(int i=0;i<numCourses;i++)
21         {
22            if(indegree[i]==0)
23            {
24                q.offer(i);
25            }
26         }
27         while(!q.isEmpty())
28         {
29            int temp = q.poll();
30            completed++;
31            for(int neigh : adj.get(temp))
32            {
33                indegree[neigh]--;
34                if(indegree[neigh]==0)
35                {
36                    q.offer(neigh);
37                }
38            }
39         }
40         return completed == numCourses;
41    }
42}