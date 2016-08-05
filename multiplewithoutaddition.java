package RandomProblems;



public class multiplewithoutaddition {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(3);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(9);
		

		ListNode l4 = new ListNode(2);
		l4.next = new ListNode(8);
		l4.next.next = new ListNode(3);
		l4.next.next.next = new ListNode(1);
		
		String num1 = String.valueOf(l1.val);
		String num2 = String.valueOf(l4.val);
		while(l1.next!=null && l4.next!=null){
			l1 = l1.next;
			l4 = l4.next;
			num1 += l1.val;	
			num2 +=l4.val;
		}
		if(l1.next!=null){
			num1 += l1.val;
			while(l1.next!=null){
				l1 = l1.next;	
				num1 +=l1.val;
			}
		}
		if(l4.next!=null){
			l4 = l4.next;
			num2 += l4.val;
			while(l4.next!=null){
				l4 = l4.next;	
				num2 +=l4.val;
			}		
		}
		int num3 = Integer.parseInt(new StringBuilder(num1).reverse().toString());
		int num4 = Integer.parseInt(new StringBuilder(num2).reverse().toString());
		System.out.println(num3*num4);

	}

}
