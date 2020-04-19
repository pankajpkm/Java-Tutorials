package com.java.tutorials.ds.linkedlist;

public class CountNode{
	
	int nodeCount=0;
	
	public int countNode(Node head){
		Node current=head;
		while(current.next!=null){
			nodeCount++;
			System.out.println("Current node data : "+current.data);
			current = current.next;
		}
		return nodeCount;
	}
	
	public static void main(String[] args) {
		Node head= new Node(1);
		Node nodeA= new Node(2);
		Node nodeB = new Node(3);
		Node nodeC = new Node(4);
		
		head.next=nodeA;
		nodeA.next=nodeB;
		nodeB.next=nodeC;
		
		CountNode cn= new CountNode();
		System.out.println("Node count :  "+cn.countNode(head));
	}
}
