package com.capg.poc;

public class LinkedList {
	Node head;

	class Node {
		Node next;
		int data;

		public Node(int data) {
			super();
			this.next = null;
			this.data = data;
		}
	}

	public LinkedList insert(LinkedList list, int data) {

		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}
		return list;
	}

	public LinkedList deleteNode(LinkedList list, int data) {
		Node currentNode = list.head;
		Node prev = null;

		// if first node (head) to be deleted
		if (currentNode != null && currentNode.data == data) {
			list.head = currentNode.next;
			System.out.println(data + " found and Deleted");
			return list;
		}

		// search the node and delete node
		while (currentNode != null && currentNode.data == data) {
			prev = currentNode;
			currentNode = currentNode.next;
		}

		if (currentNode != null) {
			prev.next = currentNode.next;
			System.out.println(data + " found and Deleted");
		} else {
			System.out.println(data + " not found");
		}
		return list;
	}
}