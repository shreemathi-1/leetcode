// Last updated: 3/16/2026, 2:08:15 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,ArrayList<String> > ans = new HashMap<>();
4        for(String s : strs)
5        {
6            char[] word = s.toCharArray();
7            Arrays.sort(word);
8              String w = new String(word);
9            if(!ans.containsKey(w))
10            {
11                ans.put(w,new ArrayList<>());
12            }
13            ans.get(w).add(s);
14        }
15        return new ArrayList(ans.values());
16             
17    }
18}
19
20
21
22
23
24// class Solution {
25//     public List<List<String>> groupAnagrams(String[] strs) {
26//         Map<String, List<String>> ans = new HashMap<>();
27
28//         for (String s : strs) {
29//             int[] count = new int[26];
30
31//             // Count frequency of each letter in the string
32//             for (char c : s.toCharArray()) {
33//                 count[c - 'a']++;
34//             }
35
36//             StringBuilder sb = new StringBuilder();
37//             for (int num : count) {
38//                 sb.append(num).append("#");
39//             }
40//             String key = sb.toString();
41//             if (!ans.containsKey(key)) {
42//                 ans.put(key, new ArrayList<>());
43//             }
44//             ans.get(key).add(s);
45//         }
46
47//         return new ArrayList<>(ans.values());        
48//     }
49// }