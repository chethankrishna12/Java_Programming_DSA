package dsa.LinkedList.DLL;

class Node {
	int val;
	Node prev;
	Node next;
}

class DoubleLinkedList {
	Node head;
	Node tail;

	public void create(int val) {
		Node node = new Node();
		node.val = val;
		node.next = null;
		node.prev = null;
		head = tail = node;
	}

	public void insertionFirst(int val) {
		Node node=new Node();
		node.val=val;
		node.prev=null;
		node.next=head;
		head.prev=node;
		head=node;
		
	}

	public void insertionLast(int val) {
		Node node=new Node();
		node.val=val;
		node.next=null;
		node.prev=tail;
		tail.next=node;
		tail=node;
	}

}

public class DLL {
	public static void main(String[] args) {

	}

}
