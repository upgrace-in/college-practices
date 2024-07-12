class MyLinkedList {

    private static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;
    int current_size = 0;

    public MyLinkedList() {
    }
    
    public int get(int index) {
        if(index < 0 || index >= current_size)
            return -1;

        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    private Node getNodeAtIndex(int index) {
        if(index < 0 || index >= current_size)
            return null;

        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.val = val;
        head = newNode;
        if(current_size == 0)
            tail = head;
        current_size++;
    }
    
    public void addAtTail(int val) {
        if(current_size == 0)
            addAtHead(val);
        else {
            tail.next = new Node(val);
            tail = tail.next;
            current_size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > current_size)
            return;
        else if(index == 0)
            addAtHead(val);
        else if(index == current_size)
            addAtTail(val);
        else{
            Node newNode = new Node(val);
            Node prevNode = getNodeAtIndex(index-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            current_size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= current_size)
            return;
        else if(current_size == 1){
            head = null;
            tail = null;
        } else if(index == 0)
            head = head.next;
        else if(index == current_size-1){
            Node previousNode = getNodeAtIndex(index-1);
            previousNode.next = null;
            tail = previousNode;
        } else {
            Node previousNode = getNodeAtIndex(index-1);
            previousNode.next = previousNode.next.next;
        }
        current_size--;
    }
}

class own {
    public static void main(String[] args){
        MyLinkedList obj = new MyLinkedList();
        // obj.addAtHead(1);
        // obj.addAtTail(3);
        // obj.addAtIndex(1, 2);  
        // obj.display();
        // System.out.println(obj.get(1)); 
        // obj.deleteAtIndex(1);    // now the linked list is 1->3
        // System.out.println(obj.get(1)); 

        // obj.addAtHead(7);
        // obj.addAtTail(7);
        // obj.addAtHead(9);
        // obj.addAtTail(8);
        // obj.addAtHead(6);
        // obj.addAtHead(0);
        // System.out.println(obj.get(5));
        // obj.addAtHead(0);
        // obj.display();
        // System.out.println(obj.get(2));
        // System.out.println(obj.get(5));
        // obj.addAtTail(4);

        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);

        System.out.println(obj.get(1));

        obj.deleteAtIndex(0);

        System.out.println(obj.get(0));
    }
}