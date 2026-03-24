// Last updated: 3/24/2026, 2:12:38 PM
1class BrowserHistory {
2    class Node
3    {
4        String url;
5        Node prev,next;
6        Node(String url)
7        {
8            this.url = url;
9            prev = next = null;
10        }
11    }
12   Node cur;
13    public BrowserHistory(String homepage) {
14        cur = new Node(homepage);
15    }
16    
17    public void visit(String url) {
18        Node nn = new Node(url);
19        cur.next = nn;
20        nn.prev = cur;
21        cur =nn;
22    }
23    
24    public String back(int steps) {
25        while(cur.prev !=null && steps>0)
26        {
27            cur = cur.prev;
28            steps--;
29        }
30        return cur.url;
31    }
32    
33    public String forward(int steps) {
34        while(cur.next !=null && steps>0)
35        {
36            cur = cur.next;
37            steps--;
38        }
39        return cur.url;
40    }
41}
42
43/**
44 * Your BrowserHistory object will be instantiated and called as such:
45 * BrowserHistory obj = new BrowserHistory(homepage);
46 * obj.visit(url);
47 * String param_2 = obj.back(steps);
48 * String param_3 = obj.forward(steps);
49 */