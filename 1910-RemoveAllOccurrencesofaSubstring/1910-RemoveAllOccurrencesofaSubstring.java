// Last updated: 3/22/2026, 9:32:26 PM
1class Solution {
2    public String removeOccurrences(String s, String part) {
3        char[] input = s.toCharArray();
4        char[] target = part.toCharArray();
5        char[] resultStack = new char[input.length];
6        int stackSize = 0, targetLength = target.length;
7        char targetEndChar = target[targetLength - 1];
8
9        for (char currentChar : input) {
10            resultStack[stackSize++] = currentChar;
11
12            if (currentChar == targetEndChar && stackSize >= targetLength) {
13                int i = stackSize - 1, j = targetLength - 1;
14                
15                while (j >= 0 && resultStack[i] == target[j]) {
16                    i--;
17                    j--;
18                }
19
20                if (j < 0) {
21                    stackSize = i + 1;
22                }
23            }
24        }
25        return new String(resultStack, 0, stackSize);
26    }
27}