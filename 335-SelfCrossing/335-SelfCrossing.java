// Last updated: 7/11/2026, 9:33:09 PM
1public class Solution {
2    public boolean isSelfCrossing(int[] x) {
3        int a1, a2, a3, a4, a5;
4        
5        // if it's increasing
6        boolean up = false;
7        
8        if (x.length < 4) {
9            return false;
10        }
11        
12        a1 = 0;
13        a2 = x[0];
14        a3 = x[1];
15        a4 = x[2];
16        
17        if (a2 < a4) {
18            up = true;
19        }
20        else {
21            up = false;
22        }
23        
24        for (int i = 3; i < x.length; i++) {
25            a5 = x[i];
26            
27            if (!up && a5 >= a3) {
28                return true;
29            }
30            else if (up && a5 <= a3) {
31                // succeeded in turning into decreasing
32                if (a5 + a1 < a3 || (i + 1 < x.length && x[i + 1] + a2 < a4)) {
33                    up = false;
34                }
35                // not end yet
36                else if (i + 1 < x.length) {
37                    return true;
38                }
39            }
40            
41            a1 = a2;
42            a2 = a3;
43            a3 = a4;
44            a4 = a5;
45        }
46        
47        return false;
48    }
49}