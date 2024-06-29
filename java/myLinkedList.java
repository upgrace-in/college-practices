class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class myLinkedList{

    private Node head;

    public void display(Node n){
        System.out.println(n.data);
        if(n.next == null) return;
        display(n.next);
    }

    public void addFirst(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void addLast(int data){
        Node n = new Node(data);
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = n;
    }

    public void addNode(int data){
        Node n = new Node(data);
        head.next = n;
    }

    public static void main(String[] args){
        myLinkedList l = new myLinkedList();

        Node n1 = new Node(4);
        l.head = n1;

        l.addNode(2);
        l.addFirst(7);
        l.addLast(4);

        l.display(l.head);
    }
}