// Last updated: 5/25/2026, 9:35:55 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6
7        int low = 1;
8        int high = n;
9
10        int mid = 0;
11        int ans = 0;
12
13        while (low <= high) {
14            mid = low + (high - low) / 2;
15            if (isBadVersion(mid)) {
16                ans = mid;
17                high = mid - 1;
18
19            } else {
20                low = mid + 1;
21            }
22        }
23        return ans;
24    }
25}