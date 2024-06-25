class Node{
    Node left, right;  // References to the left and right children of the current node
    int data;          // The integer value stored in this node
    public Node(int data) {
        this.data = data;  // Initialize the node with the given data
    }

    // Adding a node to the tree
    public void add(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.add(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.add(value);
            }
        }
    }

    //finding an element in a tree structure  (SEARCH) , Comment each step accordingly
    public boolean search(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.search(value);
            }
        } else {
            if (right == null){
                return false;
            } else {
                return right.search(value);
            }
        }
    }


    public void in_order_print(){
        if (left != null) {
            left.in_order_print();      // Step 1
        }
        System.out.println(data);       // Step 2
        if (right != null) {
            right.in_order_print();     // Step 3
        }
    }

    public void post_order(){       // Complete this method
        if (left != null){
            left.post_order();
        }
        if (right != null){
            right.post_order();
        }
        System.out.println(data);
    }

    public int findMin() {          // Complete this method
        if (left == null){
            return data;
        }
        else {
            return left.findMin();
        }
    }

    public int height(){ // Complete this method
        int leftheight = (left == null )? 0 : left.height();
        int rightheight= (right == null) ? 0 : right.height();

        return 1 + Math.max(leftheight, rightheight);
    }


    public static void main(String [] args) {
        Node our_tree = new Node(10);

        our_tree.add(8);
        our_tree.add(4);
        our_tree.add(2);
        our_tree.add(6);
        our_tree.add(10);
        our_tree.add(9);
        our_tree.add(12);


        System.out.println("In Order");
        our_tree.in_order_print();

        System.out.println("Post Order");
        our_tree.post_order();

        System.out.println("Minimum Value: " + our_tree.findMin());
        System.out.println("Tree Height: " + our_tree.height());
    }
}
