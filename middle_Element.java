import java.util.Scanner;

public class middle_Element {
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

    private static Node MiddleElement(Node head) {
        if (head == null) {
            return null;
        }
        Node Slow = head;
        Node Fast = head;
        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        return Slow;
    }

    private static Node convertArray2LL(int[] arr) {
        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static void printList(Node head) {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append("->");
            }
            temp = temp.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Node head = convertArray2LL(arr);

        Node middle = MiddleElement(head);

        printList(head);

        if (middle != null) {
            System.out.println("Middle element: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }

        scanner.close();
    }
}
