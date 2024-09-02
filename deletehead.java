public class deletehead {
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

    private static Node convertArray2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp; /* attaches a link */
            mover = temp;
        }
        return head;

    }

    private static Node Deletehead(Node head) {
        if (head == null) {
            return head;

        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 87, 9, 10 };
        Node head = convertArray2LL(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println("The deleted head is:" + head.data);
        head = Deletehead(head);
        temp = head;
        System.out.print("List after deleting head: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
