package com.linkedlist;

public class DoublyLinkedList {


	Node head;
	Node tail;

	// adding element to linkedlist
	public void add(int value) {
		Node addingNode = new Node(value);
		if (head == null) {
			head = addingNode;
		} else {
			Node nextNode = head.getNext();
			Node presentNode = head;
			while (nextNode != null) {
				presentNode = nextNode;
				nextNode = nextNode.getNext();

			}
			presentNode.setNext(addingNode);
		}
		tail = addingNode;
	}

	// adding element at starting of linkedlist
	public void addFront(int value) {
		Node addingNode = new Node(value);
		if (head == null)
			head = addingNode;
		else {
			addingNode.setNext(head);
			this.head = addingNode;
		}
	}

	// Add element t linked list after append value
	public void addAfterValue(int value, int appendValue) {
		Node addingNode = new Node(value);
		if (head == null) {
			head = addingNode;
			return;
		}
		boolean foundValue = false;
		Node nextNode = head.getNext();
		Node presentNode = head;
		while (nextNode != null) {
			if (presentNode.getValue() != appendValue) {
				presentNode = nextNode;
				nextNode = nextNode.getNext();
			} else {
				foundValue = true;
				break;
			}
		}
		if (foundValue) {
			addingNode.setNext(presentNode.getNext());
			presentNode.setNext(addingNode);
		}
	}

	// Add element to linked list before append value
	public void addBeforeValue(int value, int appendValue) {
		Node addingNode = new Node(value);
		if (head == null) {
			return;
		}
		boolean foundValue = false;
		Node nextNode = head.getNext();
		Node presentNode = head;
		Node previousNode = null;
		while (nextNode != null) {
			if (presentNode.getValue() != appendValue) {
				previousNode = presentNode;
				presentNode = nextNode;
				nextNode = nextNode.getNext();
			} else {
				foundValue = true;
				break;
			}
		}
		if (foundValue) {
			if (previousNode != null) {
				previousNode.setNext(addingNode);
			}
			addingNode.setNext(presentNode);
			if (previousNode == null) {
				head = addingNode;
			}
		}
	}
	
	public void delete(int value) {
		if(head==null) 
			return;
		Node previousNode =null;
		Node presentNode =head;
		Node nextNode = head.getNext();
		while(presentNode!=null) {
			if(presentNode.getValue() != value) {
				previousNode = presentNode;
				presentNode = nextNode;
				if(nextNode!=null) 
				nextNode = nextNode.getNext();
				
			} else {
				break;
			}
		}
		
		if(previousNode!=null) 
			previousNode.setNext(nextNode);
		else
			head = head.getNext();
	}

	//Find length of list using iterative way 
	public int findLengthIterative() {
		int count = 0;
			Node nextNode = head;
			while(nextNode!=null) {
				count+= 1;
				nextNode = nextNode.getNext();
			}
		return count;
		
	}
	
	public void findLengthRecursive(Node node, Integer count) {
		if(node != null) {
			count+= 1;
			findLengthRecursive(node.getNext(), count);
		}
	}
	
	
	// Printing linked list
	public void printList() {
		Node tnode = head;
		System.out.println("");
		while (tnode != null) {
			System.out.print(tnode.value + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.printList();
		list.add(2);
		list.printList();
		list.add(3);
		list.printList();
		list.add(4);
		list.printList();
		list.add(5);
		list.printList();
		list.addFront(6);
		list.printList();
		list.addFront(7);
		list.printList();
		list.addFront(8);
		list.printList();
		list.addAfterValue(10, 4);
		list.printList();
		list.addAfterValue(12, 8);
		list.printList();
		list.addBeforeValue(15, 6);
		list.printList();
		list.addBeforeValue(17, 8);
		list.printList();
		list.delete(6);
		list.printList();
		list.delete(17);
		list.printList();
		int count = list.findLengthIterative();
		System.out.println("");
		System.out.println("Length of list iterative = " + count);
		Integer listCount = 0;
		list.findLengthRecursive(list.head, listCount);
		System.out.println("Length of list recursive = " + count);
		
		
		//Empty Linked list
		LinkedList list2 = new LinkedList();
		System.out.println("Length of list iterative = " +list2.findLengthIterative());
		Integer listCount2 = 0;
		list2.findLengthRecursive(list2.head,  listCount2);
		System.out.println("Length of list recursive = " + listCount2);
		list2.addAfterValue(2, 5);
		list2.addBeforeValue(6, 7);
		list2.addFront(9);
		list2.add(2);
		list2.printList();
	}



}
