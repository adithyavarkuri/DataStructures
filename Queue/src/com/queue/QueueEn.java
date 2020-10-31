package com.queue;

import java.util.Stack;

//Creating enqueue as costly
public class QueueEn {
	
	Stack<String> stack1 = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	
	//adding element to queue
	public void enQueue(String value) {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(value);
		
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	
	//removing element from queue
	public String deQueue() throws Exception {
		if(stack1.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		String element = stack1.peek();
		stack1.pop();
		return element;
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
