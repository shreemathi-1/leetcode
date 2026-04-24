// Last updated: 4/24/2026, 7:32:30 PM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            result.append(temp.reverse().toString()).append(" ");
        }
        
        return result.toString().trim();
    }
}