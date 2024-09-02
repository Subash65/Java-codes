public class binary2decimal {
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

    private static int convertBinary2Decimal(Node head) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int i = size - 1;
        int result = 0;
        temp = head;
        while (temp != null) {
            if (temp.data == 1) {
                result += Math.pow(2, i);

            }
            i--;
            temp = temp.next;
        }
        return result;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        int Decimal_answer = convertBinary2Decimal(head);
        System.out.println(Decimal_answer);
    }

}
