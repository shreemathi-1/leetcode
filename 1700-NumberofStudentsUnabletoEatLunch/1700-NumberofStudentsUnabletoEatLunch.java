// Last updated: 3/26/2026, 9:26:32 AM
class Solution {
    public int countStudents(int[] s, int[] sq) {
        int n = s.length;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = n - 1; i >= 0; i--) {
            st.push(sq[i]);
        }
        for (int i = 0; i < n; i++) {
            q.add(s[i]);
        }

        int count = 0;

          while( !st.isEmpty() && count < q.size()) {
            if (st.peek()==q.peek()) {
                st.pop();
                q.remove();
                count = 0; 
            } else {
                q.add(q.remove());
                count++;
            }
        }

        return q.size();
    }
}