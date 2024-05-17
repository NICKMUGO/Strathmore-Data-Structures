import org.w3c.dom.Node;

public class LL {

    // Fields
    Node head;

    // Constructor
    public class Node{
        // Fields
        int data;
        Node next;

        // Constructor
        public Node(int userdata){
            this.data = userdata;
        }
    }

    // Methods
    public void insertStart(int userdata){
        Node newhead = new Node(userdata);
        newhead.next = head;
        head = newhead;
    } 

    public void print(){
        Node current=head;//tells us (the os) where to start
        System.out.println(" ");

        //Loop through the LL and print data at current Node,then move to the next Node

        while (current != null) {
            System.out.println(current.data + " ");
            current= current.next;     
        }
    }

    // Main method (if applicable)
    public static void main(String[] args) {
        LL scores = new LL();

        scores.insertStart(60);
        scores.insertStart(70);
        scores.insertStart(67);
        scores.insertStart(50);

        scores.print();

        scores.insertStart(40);

        scores.print();

    }
}