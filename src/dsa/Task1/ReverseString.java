package dsa.Task1;

class Node {
	char val;
	Node next;
}

class SingleLinkedList {
	Node head;
	Node tail;
	int size = 0;

	public void create(char val) {
		Node node = new Node();
		node.val = val;
		node.next = null;
		head = node;
		tail=node;
		size = 1;
	}

	public void insert(char val) {
		if (head == null) {
			create(val);
			return;
		} else {
			Node node = new Node();
			node.val = val;
			node.next = null;
			tail.next = node;
		}
		size++;
	}
	
	public Node reverse(){
		Node prev=null;
		Node mid=null;
		Node cn=head;
		while(cn!=null) {
			prev=mid;
			mid=cn;
			cn=cn.next;
			mid.next=prev;
		}
		return mid;
		
	}
	
	public void bwdtraversal() {
		Node temp=reverse();
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}

public class Task1 {
	public static void main(String[] args) {
		SingleLinkedList sll=new SingleLinkedList();
		String name="chethan";
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			sll.insert(ch[i]);
		}
		sll.bwdtraversal();
	}

}
