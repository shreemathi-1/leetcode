// Last updated: 3/24/2026, 9:38:33 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);// declare sorting order here

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.offer(lists[i]);
            }
        }

        if (pq.size() == 1) {
            return pq.poll();
        }

        ListNode dummy = new ListNode(0);
        dummy.next = pq.peek();

        ListNode curr = dummy.next;

        // While the priority queue isn't empty, get the peek node and add that to new list, and advance it
        while (!pq.isEmpty()) {
            ListNode poll = pq.poll();

            if (poll.next != null) {
                pq.offer(poll.next);
            }

            // Add into list and advance
            curr.next = poll;
            curr = curr.next;
        }

        return dummy.next;
    }
}