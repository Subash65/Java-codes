public class intersection {
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

    private static Node intersetion_node(Node list1, Node list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        Node temp1 = list1;
        Node temp2 = list2;
        while (temp1 != temp2) {
            if (temp1 == null) {
                temp1 = list2;
            } else {
                temp1 = temp1.next;
            }
            if (temp2 == null) {
                temp2 = list1;
            } else {
                temp2 = temp2.next;
            }

        }
        return temp1;

    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);
        list1.next.next.next = new Node(4);
        list1.next.next.next.next = new Node(5);

        Node list2 = new Node(1);
        list2.next = new Node(2);
        list2.next.next = new Node(3);
        list2.next.next.next = new Node(6);
        list2.next.next.next.next = new Node(7);
        list2.next.next = list1.next.next;
        list2.next.next.next = list1.next.next.next;
        list2.next.next.next.next = list1.next.next.next.next;

        Node intersectingNode = intersetion_node(list1, list2);

        if (intersectingNode != null) {
            System.out.println(intersectingNode.data);
        } else {
            System.out.println("No intersection");
        }
    }

}