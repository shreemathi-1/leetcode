// Last updated: 3/16/2026, 12:18:01 PM
1class Solution 
2{
3    public String intToRoman(int num) 
4    {
5       
6        StringBuilder res = new StringBuilder();
7        Map<Integer,String> roman = new LinkedHashMap<>();
8        roman.put(1000,"M");
9        roman.put(900,"CM");
10         roman.put(500,"D");
11         roman.put(400,"CD");
12          roman.put(100,"C");
13            roman.put(90,"XC");
14            roman.put(50,"L");
15        roman.put(40,"XL");
16         roman.put(10,"X");
17          roman.put(9,"IX"); 
18           roman.put(5,"V");   
19             roman.put(4,"IV");
20              roman.put(1,"I");
21         for(int key : roman.keySet())
22         {
23            while(num>=key)
24            {
25                res.append(roman.get(key));
26                num -= key;
27            }
28         }        
29    return res.toString();
30    }
31}