// Queue means FIFO (First In First Out)

class Node {
    int data;
    Node next;

    public Node(int val){
        this.data = val;
    }
}

class Base {

    private Node head; // remove from head
    private Node tail; // add from tail

    public boolean empty(){
        return head == null;
    }

    public int peek(){
        return head.data;
    }

    public void add(int val){
        Node n = new Node(val);
        if(tail != null){
            tail.next = n;
        }
        tail = n;
        if(head == null){
            head = n;
        }
    }

    public int pop(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return val;
    }

    public static void main(String[] args){
        Base b = new Base();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        System.out.println(b.peek());
        System.out.println(b.pop());
        System.out.println(b.peek());
    }

}