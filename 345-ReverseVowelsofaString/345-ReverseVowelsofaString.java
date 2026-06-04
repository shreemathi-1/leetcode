// Last updated: 6/4/2026, 10:30:32 PM
1class Solution 
2{
3    static boolean isVowel(char ch)
4    {
5        if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
6            return true;
7         if(ch =='A'|| ch =='E'|| ch =='I'|| ch =='O'|| ch =='U')
8            return true;
9
10        return false;
11    }
12    public String reverseVowels(String s) 
13    {
14       char[] arr = s.toCharArray();
15       int l=0,r=arr.length-1;
16       while(l < r)
17       {
18            while( l<r && ! isVowel(arr[l]))
19            {
20                l++;
21            }
22            while(l<r && !isVowel(arr[r]))
23            {
24                r--;
25            }
26            char temp = arr[l];
27            arr[l] = arr[r];
28            arr[r] = temp;
29            l++;
30            r--;
31       }
32       return new String(arr);
33    }
34}