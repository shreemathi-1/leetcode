// Last updated: 3/4/2026, 10:45:29 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
     Set<Character> dist = new HashSet<>();
     int l = 0, r = 0;
     int maxLen = 0;
     while(r < s.length()) {
        while(dist.contains(s.charAt(r))) {
            dist.remove(s.charAt(l++));
        }
        dist.add(s.charAt(r++));
         maxLen = Math.max(maxLen,r - l);
     }
     return maxLen;
    }
}