package com.stacks;

public class GenericStack<T> {
	

	
	T array[];
	int capacity;
	int top;
	
	public GenericStack(int capacity) {
		this.capacity =capacity;
		array = (T[]) new Object[capacity];
		top =-1;
	}
	
	//push element to top of stack
	public void push(T value) throws Exception {
		
		if(isFull()) {
			throw new Exception("Stack is full");
		}
		array[++top] = value;
	}
	
	//get element and remove element from top  of stack
	public T  pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return array[top--];
	}
	//get  element from top  of stack
		public T  Peek() throws Exception {
			if(isEmpty()) {
				throw new Exception("Stack is Empty");
			}
			return array[top];
		}
	
	//return size of stack
	public int size() {
		return ++top;
	}
	
	//check if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
	
	//check if stack is full
	public boolean isFull() {
		return top == capacity-1;
		
	}
	
	 public void displayStack() {
		 System.out.println();
		    for (int i = 0; i <= top; i++) {
		      System.out.print(array[i] + ", ");
		    }
		  }
	
	
	public static void main(String[] args) throws Exception {
		GenericStack<String> stack = new GenericStack<String>(5);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.displayStack();
		stack.Peek();
		stack.displayStack();
		stack.pop();
		stack.displayStack();
		
		
	}



}
