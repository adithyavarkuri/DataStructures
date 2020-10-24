package com.tree;

public class BinarySearchTree {
	
	Node root =null;
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.addNode(7);
		tree.addNode(79);
		tree.addNode(29);
		tree.addNode(2);
		tree.addNode(4);
		tree.addNode(6);
		tree.addNode(9);
		tree.addNode(67);
		tree.addNode(87);
		tree.addNode(3);
		tree.addNode(11);
		tree.addNode(18);
		tree.addNode(20);
		tree.addNode(39);
		tree.addNode(78);
		tree.addNode(8);
		tree.addNode(10);
		System.out.println(tree);
	}
	
	public void addNode(int value) {
		root =addNode(value,this.root);
		
	}
	
	public Node addNode(int value ,Node node) {
		if(node==null) {
			node = new Node(value);
			return node;
		}
		
		if(value < node.getValue()) 
			node.setLeftChild(addNode(value, node.getLeftChild()));
		else
			node.setRightChild(addNode(value, node.getRightChild()));
		return node;
	}

}
