// Last updated: 7/4/2026, 10:29:49 PM
1class Solution {
2    public int minScore(int n, int[][] roads) {
3        List<List<int[]>>list=new ArrayList<>();
4        for(int i=0;i<=n;i++)list.add(new ArrayList<>());
5        for(int[]row:roads){
6            list.get(row[0]).add(new int[]{row[1],row[2]});
7            list.get(row[1]).add(new int[]{row[0],row[2]});
8        }
9        int ans=Integer.MAX_VALUE;
10        boolean[]visited=new boolean[n+1];
11        Queue<Integer>queue=new LinkedList<>();
12        queue.offer(1);
13        while(!queue.isEmpty()){
14            int curNode=queue.poll();
15            for(int[]node:list.get(curNode)){
16                ans=Math.min(ans,node[1]);
17                if(!visited[node[0]]){
18                    visited[node[0]]=true;
19                    queue.offer(node[0]);
20                }
21            }
22        }
23        return ans;
24    }
25}