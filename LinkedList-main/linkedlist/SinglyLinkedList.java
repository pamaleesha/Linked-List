package linkedlist;

public class SinglyLinkedList {
	    // Node class representing each element in the linked list
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Head of the linked list
	    private Node head;

	    // Constructor to initialize the linked list
	    public SinglyLinkedList() {
	        head = null;
	    }

	    // Method to insert a new node at the beginning of the linked list
	    public void insertAtBeginning(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Method to insert a new node at the end of the linked list
	    public void insertAtEnd(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

	    // Method to delete a node with a given key from the linked list
	    public void deleteNode(int key) {
	        Node temp = head;
	        Node prev = null;
	        if (temp != null && temp.data == key) {
	            head = temp.next;
	            return;
	        }
	        while (temp != null && temp.data != key) {
	            prev = temp;
	            temp = temp.next;
	        }
	        if (temp == null) {
	            return;
	        }
	        prev.next = temp.next;
	    }

	    // Method to print the linked list
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        list.insertAtEnd(1);
	        list.insertAtBeginning(2);
	        list.insertAtBeginning(3);
	        list.insertAtEnd(4);
	        System.out.print("Linked list: ");
	        list.printList();
	        list.deleteNode(3);
	        System.out.print("After deleting 3: ");
	        list.printList();
	    }
	}


