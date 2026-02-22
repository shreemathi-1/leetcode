// Last updated: 2/22/2026, 8:48:45 PM
1class Solution 
2{
3    public int romanToInt(String s)
4     {
5        HashMap<Character,Integer> map = new HashMap<>();
6        map.put('I',1);
7        map.put('V',5);
8        map.put('X',10);
9        map.put('L',50);
10        map.put('C',100);
11        map.put('D',500);
12        map.put('M',1000);
13        char[] arr = s.toCharArray();
14        int res =0;
15        int i =0,j=1;
16        for( i =0,j=1;j<arr.length;i++,j++)
17        {             
18            if(map.get(arr[i]) >= map.get(arr[j]))
19            {
20                res += map.get(arr[i]) ;
21            }
22            else
23            {
24                res -= map.get(arr[i]);
25            }
26        }
27        res += map.get(arr[i]);
28        return res;
29    }
30}