// Last updated: 3/16/2026, 2:03:51 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String> > ans = new HashMap<>();
4        for(String s : strs)
5        {
6            char[] word = s.toCharArray();
7            Arrays.sort(word);
8              String w = new String(word);
9            if(!ans.containsKey(w))
10            {
11              
12                ans.put(w,new ArrayList<>());
13            }
14            ans.get(w).add(s);
15
16        }
17        return new ArrayList(ans.values());
18             
19    }
20}
21
22
23
24
25
26// class Solution {
27//     public List<List<String>> groupAnagrams(String[] strs) {
28//         Map<String, List<String>> ans = new HashMap<>();
29
30//         for (String s : strs) {
31//             int[] count = new int[26];
32
33//             // Count frequency of each letter in the string
34//             for (char c : s.toCharArray()) {
35//                 count[c - 'a']++;
36//             }
37
38//             StringBuilder sb = new StringBuilder();
39//             for (int num : count) {
40//                 sb.append(num).append("#");
41//             }
42//             String key = sb.toString();
43//             if (!ans.containsKey(key)) {
44//                 ans.put(key, new ArrayList<>());
45//             }
46//             ans.get(key).add(s);
47//         }
48
49//         return new ArrayList<>(ans.values());        
50//     }
51// }