import java.util.Stack;

public class remove_node2right {
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

    private static Node removeGreaterNode2right(Node head) {
        if (head == null) {
            return head;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        Node maxNode = stack.pop();
        @SuppressWarnings("unused")
        Node newHead = maxNode;
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.data >= maxNode.data) {
                current.next = maxNode;
                maxNode = current;

            }
        }
        maxNode.next = null;

        return maxNode;
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);

        System.out.println("Original List:");
        printList(head);

        Node result = removeGreaterNode2right(head);

        System.out.println("Modified List after removing nodes with greater values on the right:");
        printList(result);
    }
}
