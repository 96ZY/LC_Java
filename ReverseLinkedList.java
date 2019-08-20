// Just the solution part
// Time complexity: O(n);
// Space complexity: O(1);
public class SolutionOfLeetcode206 {
	public static void main(String[] args) {
		Solution206 s = new Solution206();
		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		ListNode head = s.reverseList(node1);
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.print("null");
	}
}

class Solution206 {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}

		return prev;
	}
}
