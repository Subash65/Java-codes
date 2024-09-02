public class sumList {
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

    private static Node Sum_List(Node l1, Node l2) {

        Node dummyNode = new Node(0);
        Node temp = dummyNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            sum = sum + carry;

            carry = sum / 10;

            Node node = new Node(sum % 10);
            temp.next = node;
            temp = temp.next;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {

        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = Sum_List(l1, l2);

        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
