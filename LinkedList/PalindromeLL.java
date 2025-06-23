//Approach
//1) find midNode
//2)2nd half reverse
//3) check if 1st half(left)== 2nd half(right)

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
    
    public Node MidNode(Node head){
        Node slow = head;//+1 ni pudhe janar (tortoies)
        Node fast = head; //+2 (rabbit)
        while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;

        }
        return slow;
    
    }
    public boolean checkpalindrome(){
        if( head == null || head.next == null){
            return true;
        }
        // step1 - find mid
        Node midNode = MidNode(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half's head
        Node left = head;//

        // step 3 - check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left =left.next;
            right = right.next;
        }
        return true;




    }
    

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        System.out.print("Linked List: ");
        list.printList();
        System.out.println(list.checkpalindrome());
        
        
    }
}
