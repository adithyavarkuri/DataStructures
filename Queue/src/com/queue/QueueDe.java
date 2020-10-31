package com.queue;

import java.util.Stack;

//Creating dequeue as costly
public class QueueDe {
	
	Stack<String> stack1 = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	
	//removing element to queue
	public String deQueue(String value) throws Exception {
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		if(stack2.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		String element = stack2.peek();
		stack2.pop();
		
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return element;
		
	}
	
	//adding element from queue
	public void enQueue(String value) {
		stack1.push(value);
	}
	
	public static void main(String[] args) throws Exception  
	{  
	    QueueEn queue = new QueueEn();  
	    queue.enQueue("adithya");  
	    queue.enQueue("varkuri");  
	    queue.enQueue("none");  
	  
	    System.out.println(queue.deQueue());  
	    System.out.println(queue.deQueue()); 
	    System.out.println(queue.deQueue()); 
	}  

}
