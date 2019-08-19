//Just the solution part
//The file name or the class name has to be changed when this file is openned in IDE

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class SolutionOfLeetcode21 {
	public static void main(String[] args) {
		Solution21 s = new Solution21();
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode head = s.mergeTwoLists(l1, l2);
		while (head != null) {
			System.out.print(head.val);
			System.out.print(" -> ");
			if (head.next == null) {
				System.out.print("null");
			}
			head = head.next;
		}
	}
}

class Solution21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}

		if (l1 != null) {
			cur.next = l1;
		}
		if (l2 != null) {
			cur.next = l2;
		}

		return dummyHead.next;
	}
}
