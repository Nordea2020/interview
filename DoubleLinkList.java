package com.capg.poc;

public class DoubleLinkList {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev = null;

		if (head != null) {
			head.prev = newNode;
		}

		head = newNode;
	}

	void insertAfter(Node prevNode, int data) {
		if (prevNode == null) {
			System.out.println("prevNode can not be null");
		}

		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if (newNode.next != null) {
			newNode.next.prev = newNode;
		}
	}

	void append(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		Node last = head;

		if (head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}

		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		newNode.prev = last;
	}

	void printList(DoubleLinkList dList) {
		Node last = dList.head;
		while (last != null) {
			System.out.println(last.data);
			last = last.next;
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		/* Start with the empty list */
		DoubleLinkList dll = new DoubleLinkList();
		// Insert 6. So linked list becomes 6->NULL
		dll.append(6);
		// Insert 7 at the beginning. So linked list becomes 7->6->NULL
		dll.push(7);
		// Insert 1 at the beginning. So linked list becomes 1->7->6->NULL
		dll.push(1);
		// Insert 4 at the end. So linked list becomes 1->7->6->4->NULL
		dll.append(4);
		// Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL
		dll.insertAfter(dll.head.next, 8);

		System.out.println("Created DLL is: ");
		dll.printList(dll);
	}
}
