import Scratch.LinkedList;

class Program {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
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

        System.out.println(ll.get(0));
        System.out.println(ll.get(9));
        System.out.println(ll.get(6));
        System.out.println(ll.get(3));
        System.out.println(ll.get(-1));
        System.out.println(ll.get(10));
    }
}
