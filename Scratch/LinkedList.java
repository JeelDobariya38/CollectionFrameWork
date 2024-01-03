package Scratch;

public class LinkedList {
    Node head;
    Node tail;

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
    }

    public void addFirst(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addLast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public String toString() {
        String strRepresentation = "";
        Node curr = head;

        while (curr != null) {
            strRepresentation += curr.data + " -> ";
            curr = curr.next;
        }

        return strRepresentation + "null";
    }
}
