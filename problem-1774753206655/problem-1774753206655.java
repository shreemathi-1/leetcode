// Last updated: 3/29/2026, 8:30:06 AM
1class EventManager {
2    Map<Integer,Integer> map;
3    PriorityQueue<int[]> pq;
4    public EventManager(int[][] events) {
5         map = new HashMap<>();
6        pq = new PriorityQueue<>((a,b) ->{
7           if(b[1] != a[1]) return b[1] - a[1];
8            return a[0] - b[0];
9        });
10        for(int[] e : events)
11        {
12            map.put(e[0],e[1]);
13            pq.offer(new int[]{e[0],e[1]});
14        }
15    }
16    
17    public void updatePriority(int eventId, int newPriority) {
18        map.put(eventId , newPriority);
19        pq.offer(new int[]{eventId,newPriority});
20    }
21    
22    public int pollHighest() 
23    {
24      while(!pq.isEmpty())
25          {
26              int[] top = pq.poll();
27              int id = top[0];
28              int priority = top[1];
29              if(map.containsKey(id) && map.get(id) == priority)
30              {
31                  map.remove(id);
32                  return id;
33              }
34             
35          } 
36        return -1;
37    }
38}
39
40/**
41 * Your EventManager object will be instantiated and called as such:
42 * EventManager obj = new EventManager(events);
43 * obj.updatePriority(eventId,newPriority);
44 * int param_2 = obj.pollHighest();
45 */