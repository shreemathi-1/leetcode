// Last updated: 6/27/2026, 10:31:30 PM
1class Solution 
2{
3    public int maximumLength(int[] nums) 
4    {
5        HashMap<Integer,Integer> mp = new HashMap<>();
6
7        for(int x:nums)
8            mp.put(x,mp.getOrDefault(x,0)+1);
9
10        int ans=1;
11
12        for(int x:nums){
13            if(x==1){
14                if(mp.get(x)%2!=0)
15                    ans=Math.max(ans,mp.get(x));
16                else
17                    ans=Math.max(ans,mp.get(x)-1);
18            }
19            else{
20                int ct=0;
21
22                if(mp.get(x)>=2){
23                    long curr=x;
24
25                    while(curr<=Integer.MAX_VALUE&&mp.containsKey((int)curr)){
26                        if(mp.get((int)curr)==1){
27                            ct++;
28                            break;
29                        }
30
31                        ct++;
32
33                        if(curr>Long.MAX_VALUE/curr)
34                            break;
35
36                        curr*=curr;
37                    }
38                }
39
40                ans=Math.max(ans,ct*2-1);
41            }
42        }
43
44        return ans;
45    }
46}