public class remove_duplicates_from_sorted {
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

    private static Node remove_dupli_from_sorted(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp1 = head;
        Node temp2 = head.next;
        while (temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1.next = temp2.next;
            } else {
                temp1 = temp2;
            }
            temp2 = temp2.next;

        }
        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        Node result = remove_dupli_from_sorted(head);

        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
