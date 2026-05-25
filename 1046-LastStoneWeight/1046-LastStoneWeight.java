// Last updated: 5/25/2026, 4:22:08 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int n = deck.length;
5        Queue<Integer>  q = new LinkedList<>();
6        int[] ans = new int[n];
7        for(int i =0;i<n;i++)
8        {
9            q.offer(i);
10        }
11        for(int card : deck)
12        {
13           int index= q.poll();
14           ans[index] = card;
15           if(!q.isEmpty())
16                q.offer(q.poll());
17        }
18        return ans;
19    }
20}