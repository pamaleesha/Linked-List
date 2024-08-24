package linkedlist;

public class LinkedList {
	
	    private Node head;

	    // Node class to represent each element in the linked list
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Insert a new node at the end of the list
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    // Delete the first node of the list
	    public void delete() {
	        if (head == null) {
	            System.out.println("The list is empty, nothing to delete.");
	            return;
	        }
	        head = head.next;
	    }

	    // Print the elements of the list
	    public void printList() {
	        if (head == null) {
	            System.out.println("The list is empty.");
	            return;
	        }
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.printList(); // Should print 10 20 30

	        list.delete();
	        list.printList(); // Should print 20 30

	        list.delete();
	        list.printList(); // Should print 30

	        list.delete();
	        list.printList(); // Should print The list is empty.
	    }
	}


