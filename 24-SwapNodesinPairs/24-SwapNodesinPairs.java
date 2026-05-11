// Last updated: 5/11/2026, 9:35:12 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        Map<Character, Character> mapping = new HashMap<>();
5        mapping.put(')','(');
6        mapping.put('}','{'); 
7        mapping.put(']','[');  
8
9
10        for (char c : s.toCharArray()) {
11            if (mapping.containsValue(c)) {
12                stack.push(c);
13            } else if (mapping.containsKey(c)) {
14                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
15                    return false;
16                }
17            }
18        }
19        return stack.isEmpty();
20    }
21}