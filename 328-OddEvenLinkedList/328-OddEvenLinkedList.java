// Last updated: 5/25/2026, 9:34:12 PM
1public class Solution extends GuessGame {
2    public int guessNumber(int n) {
3        if (n == 1) return 1;
4        int low = 1, high = n;
5        while (low <= high){
6            int mid = low + (high - low) / 2;
7            int check = guess(mid);
8            if (check == 0) return mid;
9            else if (check == 1) low = mid + 1;
10            else high = mid - 1;
11        }
12        return -1;
13    }
14}