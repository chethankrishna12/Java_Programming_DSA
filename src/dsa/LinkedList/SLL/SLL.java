package dsa.LinkedList.SLL;

class Node {
	int val;
	Node next;
}

class Single_LinkedList {
	Node head;
	Node tail;
	int size;

	// node creation
	public void create(int val) {
		Node node = new Node();
		node.val = val;
		node.next = null;
		head = tail = node;
		size = 1;
	}

	// node insertion at particular position based one loc
	public void insertion(int loc, int val) {
		if (head == null) {
			create(val);
			return;
		}

		Node node = new Node();
		node.val = val;
		if (loc == 0) {
			node.next = head;
			head = node;

		} else if (loc >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			int place = 0;
			Node temp = head;
			while (place < loc - 1) {
				temp = temp.next;
				place++;
			}
			node.next = temp.next;
			temp.next = node;
		}
		size++;
	}

	// Linked List traversal
	public void traversal() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// search the given value in linkedlist
	public void search(int data) {
		if (head == null) {
			System.out.println("list is empty nothing to search");
			return;
		}
		Node temp = head;
		while (temp != null) {
			if (data == temp.val) {
				System.out.println(temp.val + "is present in the List");
				return;
			}
			temp = temp.next;
		}
		  System.out.println(data + " is not present in the List");
	}

	// finding the middle node
	public void find_mid() {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Mid val is " + slow.val);
	}

	// backward traversal of List by using reverse()
	public void bwdTraversal() {
		Node temp = reverse();
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// re
	public Node reverse() {
		Node prev = null;
		Node mid = null;
		Node cn = head; // cn means - current node
		while (cn != null) {
			prev = mid;
			mid = cn;
			cn = cn.next;
			mid.next = prev;
		}
		return mid;
	}

	// DeleteFirst
	public void deleteFirst() {
		if (head == null || head.next == null) {
			head = null;
			return;
		} else {
			head = head.next;
		}
	}

	// DeleteLast
	public void deleteLast() {
		if (head == null || head.next == null) {
			head = null;
			return;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
	}

	public void deleteMid(int deleteIndex) {

		if (deleteIndex < 0 || deleteIndex >= size) {
			System.out.println("Invalid delete index");
			return;
		}
		if (deleteIndex == 0) {
			deleteFirst();
			return;
		}
		if (deleteIndex >= size) {
			deleteLast();
		}
		int index = 0;
		Node temp = head;
		while (index < deleteIndex - 1 && temp != null && temp.next != null) {
			temp = temp.next;
			index++;
		}
		temp.next = temp.next.next;
		size--;
	}

}

public class SLL {
	public static void main(String[] args) {
		Single_LinkedList list = new Single_LinkedList();
		list.insertion(0, 10);
		list.insertion(0, 20);
		list.insertion(0, 30);
		list.insertion(4, 700);
		list.insertion(5, 800);
		list.insertion(2, 999999);
		list.insertion(21, 456);
		list.traversal();
		list.find_mid();
		list.bwdTraversal();
	}
}
