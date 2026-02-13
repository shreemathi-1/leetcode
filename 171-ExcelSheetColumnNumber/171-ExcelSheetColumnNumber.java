// Last updated: 2/13/2026, 3:16:45 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int val = columnTitle.charAt(i) - 'A' + 1;  //  char → number
            sum = sum * 26 + val;                        // base-26 conversion
        }

        return sum;
    }
}