import Scratch.LinkedList;

class Program {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        System.out.println("Size: " + ll.size());

        System.out.println(ll.removeFirst());
        System.out.println(ll);

        System.out.println("Size: " + ll.size());
        System.out.println(ll.removeLast());
        System.out.println(ll);

        ll.addFirst(0);
        ll.addFirst(301);
        ll.addFirst(3031);
        ll.addFirst(680);
        ll.addFirst(30);
        ll.addLast(18);
        ll.addLast(513);
        ll.addLast(815);
        ll.addLast(158);

        System.out.println(ll);
        System.out.println("Size: " + ll.size());

        // System.out.println(ll.get(0));
        // System.out.println(ll.get(9));
        // System.out.println(ll.get(6));
        // System.out.println(ll.get(3));
        // System.out.println(ll.get(-1));
        // System.out.println(ll.get(10));

        // ll.set(0, 13330);
        // ll.set(5, 12922);
        // ll.set(9, 1266);

        // System.out.println(ll);

        // ll.set(0, 4422);
        // ll.set(10, 2652);
        // ll.set(-1, 26212);
    
        // System.out.println(ll.get(0));
        // System.out.println(ll.get(9));

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll);
        System.out.println("Size: " + ll.size());

        System.out.println(ll.removeLast());
        System.out.println(ll.removeLast());
        System.out.println(ll);
        System.out.println("Size: " + ll.size());
    }
}
