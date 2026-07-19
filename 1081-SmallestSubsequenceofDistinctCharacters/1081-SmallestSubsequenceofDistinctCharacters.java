// Last updated: 7/19/2026, 9:30:38 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3       int b=0;
4       int a=0;
5       int l=0;
6       int o=0;
7       int n=0;
8       for(char c:text.toCharArray()){
9        if(c=='b'){
10            b++;
11        }else if(c=='a'){
12            a++;
13        }else if(c=='l'){
14            l++;
15        }else if(c=='o'){
16            o++;
17        }else if(c=='n'){
18            n++;
19        }
20       }
21       int res = Math.min(b, Math.min(a , Math.min(l/2,Math.min(o/2,n))));
22       return res; 
23    }
24}