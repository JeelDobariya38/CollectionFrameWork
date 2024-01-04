package Scratch;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }

        size++;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }

        size++;
    }

    public String toString() {
        String strRepresentation = "";
        Node curr = head;

        if (curr == null) {
            return "Linkedlist is Empty!!!!!";
        }

        while (curr != null) {
            strRepresentation += curr.data + " -> ";
            curr = curr.next;
        }

        return strRepresentation + "null";
    }

    public int size() {
        return this.size;
    }

    public int get(int idx) {
        if (idx >= size || idx < 0) {
            return -1;
        }
        
        int i = 0;
        Node curr = head;

        while (i < idx) {
            curr = curr.next;
            i++;
        }

        return curr.data;
    }

    public void set(int idx, int data) {
        if (idx >= size || idx < 0) {
            return;
        }
        
        int i = 0;
        Node curr = head;

        while (i < idx) {
            curr = curr.next;
            i++;
        }

        curr.data = data;
    }

    public int removeFirst() {
        if (head == null) {
            return -1;
        } else {
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }
}
