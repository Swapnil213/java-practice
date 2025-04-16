package linkedList;

public class InsertNode {
        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void traverseAndPrint(Node head) {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }

        public static Node insertNodeAtPosition(Node head, Node newNode, int position) {
            if (position == 1) {
                newNode.next = head;
                return newNode;
            }

            Node currentNode = head;
            for (int i = 1; i < position - 1 && currentNode != null; i++) {
                currentNode = currentNode.next;
            }

            if (currentNode != null) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            return head;
        }

        public static void main(String[] args) {
            Node node1 = new Node(7);
            Node node2 = new Node(3);
            Node node3 = new Node(2);
            Node node4 = new Node(9);

            node1.next = node2;
            node2.next = node3;
            node3.next = node4;

            System.out.println("Original list:");
            traverseAndPrint(node1);

            // Insert a new node with value 97 at position 2
            Node newNode = new Node(97);
            node1 = insertNodeAtPosition(node1, newNode, 2);

            System.out.println("\nAfter insertion:");
            traverseAndPrint(node1);
        }
}
