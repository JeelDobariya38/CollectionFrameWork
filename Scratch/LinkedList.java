package Scratch;

public class LinkedList {
    Node head;
    Node tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
}
