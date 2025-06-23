class LinkedList1 {
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
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if (temp.data==key){
                return i ;

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int recSearch(int key){
        int i=0;
        while(head!=null){
            
            if(head.data == key){
                return i;
            }
            head=head.next;
            i++;

        }
        return -1;
    }


    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("Linked List: ");
        list.printList();
        // System.out.println("the key is present at index:"+list.itrSearch(20));
        System.out.println("the key is present at index:"+list.recSearch(40));
        
    }
}
