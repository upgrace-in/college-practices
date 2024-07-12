// Stack means FIFO (First In First Out)

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

class Base{
    
    private Node top;

    public boolean empty(){
        return top == null;
    }

    public int peek(){
        return top.data;
    }

    public void add(int val){
        Node n = new Node(val);
        n.next = top;
        top = n;
    }

    public int pop(){
        int val = top.data;
        top = top.next;
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