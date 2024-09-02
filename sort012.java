import java.util.Scanner;

public class sort012 {
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

    private static Node sort0s1s2s(Node head) {
        if (head == null) {
            return null;
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            } else if (temp.data == 1) {
                count1++;
            } else if (temp.data == 2) {
                count2++;
            }
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (count0 > 0) {
                temp.data = 0;
                count0--;
            } else if (count1 > 0) {
                temp.data = 1;
                count1--;
            } else if (count2 > 0) {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head;

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
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Node head = convertArray2LL(arr);
        Node result = sort0s1s2s(head);
        printList(result);
        scanner.close();

    }

}