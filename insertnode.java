class insertnode {
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

    private static Node insertAtHead(Node head, int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static Node insertAtTail(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
        return head;
    }

    private static Node insertAtkth(Node head, int newData, int k) {
        Node newNode = new Node(newData);
        if (k == 1) {
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < k - 1) {

            temp = temp.next;
            count++;
        }
        if (temp == null) {
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 11, 100 };
        Node head = convertArray2LL(arr);
        head = insertAtHead(head, 1);
        head = insertAtTail(head, 10001);
        head = insertAtkth(head, 193, 3);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }

    }
}
