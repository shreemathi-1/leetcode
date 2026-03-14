// Last updated: 3/14/2026, 3:02:25 PM
1class H2O 
2{
3
4int hCount =0;
5
6    public synchronized void hydrogen(Runnable releaseHydrogen) throws InterruptedException
7     {
8		while(hCount ==2)
9        {
10            try
11            {
12wait();
13            }
14            catch(InterruptedException e)
15            {
16
17            }
18            
19        }
20        hCount++;
21        releaseHydrogen.run();
22        notifyAll();
23    }
24
25    public synchronized void oxygen(Runnable releaseOxygen) throws InterruptedException 
26    {
27        while(hCount < 2)
28        {
29             try
30            {
31wait();
32            }
33            catch(InterruptedException e)
34            {
35
36            }
37        }
38        hCount = 0;
39		releaseOxygen.run();
40           notifyAll();
41    }
42}