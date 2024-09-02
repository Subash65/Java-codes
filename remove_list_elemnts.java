public class remove_list_elemnts {
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

    private static Node removeListElements(Node head, int value) {
        if (head == null) {
            return head;
        }
        Node dummyNode = new Node(0);
        Node current = dummyNode;
        Node temp = head;
        while (temp != null) {
            if (temp.data != value) {
                current.next = temp;
                temp = temp.next;
                current = current.next;
            } else {
                temp = temp.next;
            }
        }
        current.next = null;
        return dummyNode.next;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();

        Node result = removeListElements(head, 2);

        temp = result;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
    }
}
