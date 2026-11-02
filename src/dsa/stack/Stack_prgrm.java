package dsa.stack;

public class Stack_prgrm {
	int [] stack;
	int tos;
	public void Creation(int size) {
		stack =new int[size];
		tos=-1;
	}
	
	public boolean isEmpty() {
		return tos==-1;
	}
	public boolean isFull() {
		return tos==stack.length-1;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			stack[++tos]=value;
		}
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack is Empty");
		}
		else {
			int data=stack [tos];
			tos--;
			System.out.println(data +" is removed from the stack");
		}
		
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("stack is Empty");
		}
		else {
			System.out.println(stack[tos]);
		}
		
	}
	public void delete() {
		stack =null;
		System.out.println("stack is deleted");
		
	}

}
