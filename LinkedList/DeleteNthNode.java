class LinkedList {

    void addFirst(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // Function to add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Function to print the linked list
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
    public void DeleteNthNode(int n){
        
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("Linked List: ");
        list.printList();
    }
}
