// Last updated: 8/20/2026, 11:07:42 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0, right = s.length()-1;
4        while(left < right)
5        {
6            while( left < right && !Character.isLetterOrDigit(s.charAt(left)))
7            {
8                left++;
9            }
10            while( left < right && !Character.isLetterOrDigit(s.charAt(right)))
11            {
12                right--;
13            }
14            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
15            {
16                return false;
17            }
18            left++;
19            right--;
20        }
21        return true;
22    }
23}