package linkedlist;

public class DoublyLinkedList<T> {
	    private Node<T> head;
	    private Node<T> tail;
	    private int size;

	    private static class Node<T> {
	        T data;
	        Node<T> prev;
	        Node<T> next;

	        Node(T data) {
	            this.data = data;
	            this.prev = null;
	            this.next = null;
	        }
	    }

	    public DoublyLinkedList() {
	        head = null;
	        tail = null;
	        size = 0;
	    }

	    public void addFirst(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (isEmpty()) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	        size++;
	    }

	    public void addLast(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (isEmpty()) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	        size++;
	    }

	    public void removeFirst() {
	        if (isEmpty()) {
	            throw new RuntimeException("List is empty");
	        }
	        head = head.next;
	        if (head != null) {
	            head.prev = null;
	        } else {
	            tail = null;
	        }
	        size--;
	    }

	    public void removeLast() {
	        if (isEmpty()) {
	            throw new RuntimeException("List is empty");
	        }
	        tail = tail.prev;
	        if (tail != null) {
	            tail.next = null;
	        } else {
	            head = null;
	        }
	        size--;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public int size() {
	        return size;
	    }

	    public void display() {
	        Node<T> current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
	        list.addFirst(3);
	        list.addFirst(2);
	        list.addFirst(1);
	        list.addLast(4);
	        list.addLast(5);

	        list.display(); // Should print: 1 2 3 4 5

	        list.removeFirst();
	        list.removeLast();

	        list.display(); // Should print: 2 3 4
	    }
	}


