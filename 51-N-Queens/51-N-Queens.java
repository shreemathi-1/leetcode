// Last updated: 3/26/2026, 12:24:51 PM
1class Solution 
2{
3    public ArrayList<String> res = new ArrayList<>();
4
5    public void gen(int op , int cl,String s,int n )
6    {
7        if(s.length() == 2*n)
8        {
9            res.add(s);
10            return;
11        }
12        if(op<n)
13        {
14            gen(op+1,cl,s+"(",n);
15        }
16        if(cl<op)
17        {
18            gen(op,cl+1,s+")",n);
19        }
20    }    
21    public List<String> generateParenthesis(int n) 
22    {
23        gen(0,0,"",n);
24        return res;
25    }
26}