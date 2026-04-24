// Last updated: 4/24/2026, 7:54:13 PM
1class Solution 
2{
3  public String addBinary(String a, String b) 
4  {
5    StringBuilder sb = new StringBuilder();
6    int carry = 0;
7    int i = a.length() - 1;
8    int j = b.length() - 1;
9    while (i >= 0 || j >= 0 || carry == 1) 
10    {
11      if(i >= 0)
12        carry += a.charAt(i--) - '0';
13      if(j >= 0)
14        carry += b.charAt(j--) - '0';
15      sb.append(carry % 2);
16      carry /= 2;
17    }
18    return sb.reverse().toString();
19  }
20}