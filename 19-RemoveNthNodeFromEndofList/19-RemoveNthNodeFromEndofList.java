// Last updated: 4/28/2026, 7:39:07 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      head = reverse(head);

      if (n == 1)
        return reverse(head.next);

      var temp = head;

      while (n > 2) {
        temp = temp.next;
        n--;
      }
      temp.next = temp.next.next;
      return reverse(head);
    }

    ListNode reverse(ListNode head) {
      ListNode prev = null;

      while (head != null) {
        var nxt = head.next;
        head.next = prev;
        prev = head;
        head = nxt;
      }
      return prev;
    }
  }