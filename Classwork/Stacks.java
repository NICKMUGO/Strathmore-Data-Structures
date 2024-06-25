import java.util.EmptyStackException;

public class Stacks {
    private static class Node {
        private int data;
        private Stacks.Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    // Method 1: Check if stack is empty
    public void isEmpty(){
        if (top == null) throw new EmptyStackException();
    }

    // Method 2: Peek and see the currecnt node at the top of the stack
    public int peek(){
        if (top == null) throw new EmptyStackException();
         else {
                return top.data;
              }
    }


    // Method 3: Adding node at top of stack
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        }


    // Method 4: Delete and return the deleted value
    public int pop(){
        if (top == null) throw new EmptyStackException();
        
        else {
                int temp = top.data;
                top = top.next;
                return temp;
                }
            }
    // Method 5: Delete nodes in the stack
    public void clear(){
        top = null;
        }



    public static void main(String[] args) {
        Stacks plates = new Stacks();

        plates.push(10);
        plates.push(20);
        plates.push(30);

        System.out.println("The top of the stack is "+plates.peek());

        plates.push(40);

        System.out .println("The new top of stack is "+plates.peek());

        System.out.println("The popped value is "+plates.pop());

        System.out.println("The new top is "+plates.peek());

    }
}