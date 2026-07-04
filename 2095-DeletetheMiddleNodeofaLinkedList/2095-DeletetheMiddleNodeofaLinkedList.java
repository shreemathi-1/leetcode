// Last updated: 7/4/2026, 10:28:22 PM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> wordSet = new HashSet<>(wordList);
4        if (!wordSet.contains(endWord)) return 0;
5
6        Queue<String> queue = new LinkedList<>();
7        queue.offer(beginWord);
8        int steps = 1;
9
10        while (!queue.isEmpty()) {
11            int size = queue.size();
12            while (size-- > 0) {
13                String word = queue.poll();
14                if (word.equals(endWord)) return steps;
15
16                for (int i = 0; i < word.length(); i++) {
17                    for (char c = 'a'; c <= 'z'; c++) {
18                        char[] chars = word.toCharArray();
19                        chars[i] = c;
20                        String newWord = new String(chars);
21
22                        if (wordSet.contains(newWord)) {
23                            queue.offer(newWord);
24                            wordSet.remove(newWord);
25                        }
26                    }
27                }
28            }
29            steps++;
30        }
31        return 0;
32    }
33}