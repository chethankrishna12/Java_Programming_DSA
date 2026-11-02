package dsa.Queue;

public class Queue {
	int[] queue;
	int toq,boq;
	Queue(int size){
		queue=new int[size];
		toq=boq=-1;
	}
	
	
	public boolean isFull() {
		return toq==queue.length-1;
	}
	
	public boolean isEmpty() {
		return toq==-1 || boq==queue.length;
	}
	
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			if(boq==-1) {
				queue[++toq]=val;
				boq++;
				System.out.println("The value is inserted");
			}
			else {
				queue[++toq]=val;
				System.out.println("The value is inserted");
			}
		}
	}
	
	
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("The top most Element is :"+queue[boq]);
		}
	}
	
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			int val=queue[boq];
			boq++;
			System.out.println("The "+val+" got deleted");
		}
		if(boq>toq) {
			toq=boq=-1;
		}
	}
	
	
	void delete() {
		queue=null;
		System.out.println("Queue got deleted");
	}
	
	
	public static void main(String[] args) {
		Queue q=new Queue(5);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.peek();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
	}

}
