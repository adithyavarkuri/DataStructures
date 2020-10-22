package com.linkedlist;

public class LinkedList {
	
	Node head;
	Node tail;
	
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	public void add(int value) {
		Node addingNode = new Node(value);
		if(head==null) {
			head =addingNode;
			
		}else {
			Node nextNode = head.getNext();
			Node presentNode =head;
			while(head.getNext() !=null) {
				next =next.getNext();
			}
			next.setNext(addingNode);
		}
		tail =addingNode;
		
		
	}


}

class Node{
	
	int  value;
	Node next;
	
	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}




