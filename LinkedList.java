class Node {
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

};

public class LinkedList {
    private static Node convertarr2Link(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    private static int lengthOfLnkedList(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    static int checkifvalueispresent(Node head, int k) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                return 1;
            }
            temp = temp.next;

        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 10 };
        Node y = new Node(arr[4] + arr[6]);
        Node head = convertarr2Link(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Head data :" + head.data);
        System.out.println("Node y data: " + y.data);
        System.out.println("Length of linked list: " + lengthOfLnkedList(head));
        System.out.println("Is value 5 present? " + (checkifvalueispresent(head, 5) == 1 ? "YES" : "NO"));

    }
}

/*
 * creation of linkedlist
 * searching
 * length of linked list
 * find head
 * addition of elements in liked list
 */