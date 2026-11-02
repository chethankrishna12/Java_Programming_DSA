package dsa;

class Node{
	int val;
	Node next;
}

class SingleLinkedList{
	Node head;
	Node tail;
	int size;
	
	public void create(int val) {
		Node node=new Node();
		node.val=val;
		node.next=null;
		head=tail=node;
		size=1;
	}
	
	public void insert(int loc,int val) {
		if(head==null) {
			create(val);
			return;
		}
		
		Node node=new Node();
		node.val=val;
		if(loc==0) {
			node.next=head;
			head=node;
		}
		else if(loc>=size) {
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else {
			int place=0;
			Node temp=head;
			while(place<loc-1) {
				
				temp=temp.next;
				place++;
			}
			node.next=temp.next;
			temp.next=node;
		}
		size++;
	}
	
	
	public void traverse() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void search(int data) {
		Node temp=head;
		while(temp!=null) {
			if(data==temp.val) {
				System.out.println("data found");
				return;
			}
			temp=temp.next;
		}
		System.out.println("data not found");
	}
	
	public void mid() {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println("mid val is "+slow.val);
	}
}

public class Practice{
	public static void main(String[] args) {
		SingleLinkedList sll=new SingleLinkedList();
		sll.insert(0, 10);
		sll.insert(1, 20);
		sll.insert(2, 30);
		sll.insert(3, 40);
		sll.insert(4, 50);
		sll.insert(5, 60);
		sll.traverse();
		sll.mid();
	}
}
