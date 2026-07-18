// Last updated: 7/18/2026, 8:32:39 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        int[] freq = new int[26];
4        for(int i =0;i<s.length();i++)
5            {
6               freq[s.charAt(i) - 'a']++;
7            }
8       StringBuilder sb = new StringBuilder();
9        int freqY = freq[y-'a'];
10        for(int i =0;i<freqY ;i++)
11            {
12                sb.append(y);
13            }
14        for(int i =0;i<26;i++)
15            {
16                char ch = (char)('a'+i);
17                if(ch != x && ch != y)
18                {
19                    for(int j =0;j<freq[i];j++)
20                        {
21                            sb.append(ch);
22                        }
23                }
24            }
25        int freqX = freq[x - 'a'];
26        for(int i =0;i<freqX;i++)
27            {
28                sb.append(x);
29            }
30        return sb.toString();
31    }
32}