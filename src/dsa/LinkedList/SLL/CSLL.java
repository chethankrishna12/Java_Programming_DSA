package dsa.LinkedList.SLL;

class CircularSingleLinkedList {
	Node head;
	Node tail;

	// node creation
	public void create(int val) {
		Node node = new Node();
		node.val = val;
		node.next = node;
		head = tail = node;
	}
	
	
	public void insert(int val) {
		Node node =new Node();
		node.val=val;
		node.next=head;
		head=node;
		tail.next=head;
	}
	
	public void checkCyclic() {
		if(head==null||head.next==null) {
			System.out.println("Acyclic");
			return;
		}
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				System.out.println("cyclic");
				return;
			}
		}
		syos
	}
}

public class CSLL {

}
