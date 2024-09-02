public class detect_cycle {
    static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    private static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(3);
        Node third = new Node(2);
        Node fourth = new Node(1);
        Node fifth = new Node(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        if (detectCycle(head)) {
            System.out.print("Cycle is detected");
        } else {
            System.out.print("No cycle is detected");
        }
    }
}
