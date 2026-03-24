// Last updated: 3/24/2026, 10:13:06 AM
1class Node 
2{
3    int val;
4    Node next;
5    Node(int val)
6    {
7        this.val = val;
8        this.next = null;
9    }
10}
11class MyLinkedList {
12    Node head;
13    Node tail;
14    int c =0;
15    public MyLinkedList() {
16        head = null;
17        tail = null;
18    }
19    
20    public int get(int index) 
21    {
22        Node temp = head;
23        if(index < 0 || index >= c)
24        {
25            return -1;
26        }
27        else
28        { 
29            for(int i =0;i<index;i++)
30            {
31                temp = temp.next;
32            }
33            return temp.val;
34        }
35    }
36    
37    public void addAtHead(int val) {
38        Node nn = new Node(val);
39        if(head == null)
40        {
41            head =nn;
42            tail =nn;
43        }
44        else
45        {
46            nn.next = head;
47            head = nn;
48        }
49        c++;
50    }
51    
52    public void addAtTail(int val) {
53        Node nn = new Node(val);
54        if(head == null)
55        {
56            head = tail = nn;  
57        }
58        else
59        {
60            tail.next = nn;
61            tail = nn;
62        }
63        c++;
64    }
65    
66    public void addAtIndex(int index, int val) 
67    {
68        if(index <0 || index >c)
69        {
70            return;
71        }
72        Node nn= new Node(val);
73        if(index ==0)
74        {
75            addAtHead(val);
76        }
77        else if(index == c)
78        {
79            addAtTail(val);
80        }
81       else {
82         Node temp = head;
83        for(int i =0;i<index-1;i++)
84        {
85            temp = temp.next;
86        }
87        nn.next = temp.next;
88        temp.next = nn;
89        c++;
90        }
91    }
92    
93    public void deleteAtIndex(int index) 
94    {
95        if(index<0 || index >=c)
96        {
97            return;
98        }
99        Node temp = head;
100        if(index ==0)
101        {
102            head = head.next;
103            if(head == null)
104            {
105                tail = null;
106            }
107            
108        }
109        else
110        {
111            for(int i =0;i<index-1;i++)
112            {
113                temp= temp.next;
114            }
115            temp.next = temp.next.next;
116            if(temp.next == null)
117            {
118                tail = temp;
119            }
120        }
121        c--;
122    }
123}
124
125/**
126 * Your MyLinkedList object will be instantiated and called as such:
127 * MyLinkedList obj = new MyLinkedList();
128 * int param_1 = obj.get(index);
129 * obj.addAtHead(val);
130 * obj.addAtTail(val);
131 * obj.addAtIndex(index,val);
132 * obj.deleteAtIndex(index);
133 */