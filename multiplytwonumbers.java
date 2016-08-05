package RandomProblems;



public class multiplytwonumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		int firstVal = 0, secondVal = 0, carry = 0;
		int tempSum = 0;
		ListNode result2 = result;
		while (l1 != null && l2 != null) {
			firstVal = l1.val;
			secondVal = l2.val;
			tempSum = firstVal + secondVal;
			if (tempSum > 9) {
				tempSum = tempSum % 10;
				carry = 1;

			}
			result.val += tempSum;
			ListNode newNode = new ListNode(carry);
			result.next = newNode;
			carry = 0;
			if (l1.next == null && l2.next == null) {
				break;
			}
			result = result.next;
			l1 = l1.next;
			l2 = l2.next;

		}

		return result2;
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(3);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(9);
		

		ListNode l4 = new ListNode(2);
		l4.next = new ListNode(8);
		l4.next.next = new ListNode(3);
		
		
		int j = 1;
		int tt = 0;
		while (l4 != null) {
			tt += l4.val * j;
			l4 = l4.next;
			j *= 10;
		}
		long partialSum = 0;
		for (int k = 0; k < tt / 2; k++) {
			multiplytwonumbers result = new multiplytwonumbers();
			ListNode l2 = result.addTwoNumbers(l1, l1);

			int i = 1;
			int tempr = 0;

			while (l2 != null) {
				tempr += l2.val * i;
				l2 = l2.next;
				i = i * 10;
			}
			partialSum += tempr;
		}
		System.out.println(partialSum);

	}

}
