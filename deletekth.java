public class deletekth {
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
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    @SuppressWarnings("unused")
    private static Node Deletehead(Node head) {
        if (head == null) {
            return head;

        }
        return head.next;
    }

    @SuppressWarnings("unused")
    private static Node deletetail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node Deletekth(Node head, int k) {
        if (head == null || k < 1) {
            return head;
        }
        if (k == 1) {
            return head.next;
        }
        Node temp = head;
        int count = 1;
        Node prev = null;
        while (temp != null) {
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        return head;
    }

    private static Node DeleteElem(Node head, int Elem) {
        if (head == null) {
            return head;
        }
        if (head.data == Elem) {
            @SuppressWarnings("unused")
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == Elem) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 11 };
        Node head = convertArray2LL(arr);
        head = DeleteElem(head, 7);
        head = Deletekth(head, 4);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

}
