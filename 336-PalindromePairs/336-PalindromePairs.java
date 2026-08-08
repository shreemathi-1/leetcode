// Last updated: 8/8/2026, 7:41:39 PM
1class Solution 
2{
3    public List<List<Integer>> palindromePairs(String[] words) 
4    {
5        HashMap<String,Integer> wordMap = new HashMap<>();
6        Set<Integer> set = new TreeSet<>();
7        int n = words.length;
8        
9        for(int i=0;i<n;i++){
10            wordMap.put(words[i],i);
11            set.add(words[i].length());
12        }
13        
14        List<List<Integer>> ans = new ArrayList<>();
15        
16        for(int i=0;i<n;i++){
17            int length = words[i].length();
18        
19            String reverse= new StringBuilder(words[i]).reverse().toString();
20            if(wordMap.containsKey(reverse) && wordMap.get(reverse) != i)
21                ans.add(Arrays.asList(i,wordMap.get(reverse)));
22            
23            for(Integer k:set){
24                if(k==length)
25                    break;
26                if(isPalindrome(reverse,0,length-1-k)){
27                    String s1 = reverse.substring(length-k);
28                    if(wordMap.containsKey(s1))
29                        ans.add(Arrays.asList(i,wordMap.get(s1)));
30                }
31                
32                if(isPalindrome(reverse,k,length-1)){
33                    String s2 = reverse.substring(0,k);
34                    if(wordMap.containsKey(s2))
35                        ans.add(Arrays.asList(wordMap.get(s2),i));
36                }
37            }
38        }
39        return ans;
40    }
41    
42    private boolean isPalindrome(String s, int left, int right){
43        while(left<right)
44            if(s.charAt(left++)!=s.charAt(right--))
45                return false;
46        return true;
47    }
48}