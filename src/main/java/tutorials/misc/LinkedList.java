package src.main.java.tutorials.misc;

import java.util.NoSuchElementException;

public class LinkedList {
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	private Node head;
	private Node tail;
	
	public void addLast(int item) {
		Node node = new Node(item);
		if(isEmpty())
			head = tail = node;
		else {
			tail.next = node;
			tail = node;
		}
	}
	
	public void addFirst(int item) {
		Node node= new Node(item);
		if(isEmpty())
			head=tail=node;
		else {
			node.next = head;
			head = node;
		}		
	}
	
	public int indexOf(int item) {
		int index = 0;
		Node current = head;
		while(current != null) {
			if(current.value==item) return index;
			current = current.next;
			index++;				
		}
		return -1;
	}
	
	public boolean contains(int item) {
		return indexOf(item)!=-1;
	}
	
	public void deleteFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(head == tail) {
			head = tail = null;
			return;
		}			
		Node second = head.next;
		head = null;
		head = second;
	}
	
	public void deleteLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(head == tail) {
			head = tail = null;
			return;
		}
			
		Node previous = getPrevious(tail);
		tail = previous;
		tail.next = null;
	}
	
	private Node getPrevious(Node node) {
		Node current = head;
		while(current != null) {
			if(current.next == node) return current;
			current = current.next;
		}
		return null;
	}
	private boolean isEmpty() {
		return head == null;
	}
}
