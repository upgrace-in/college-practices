class myCircularQueue{

    private int[] data;
    private int head;
    private int tail;
    private int size;

    public myCircularQueue(int k) {
        data = new int[k];
        head = tail = -1;
        size = k;
    }

    public boolean enQueue(int value){
        if(isFull() == true){
            return false;
        }
        if(isEmpty() == true){
            head = 0;
        }
        tail = (tail+1) % size;
        data[tail] = value;
        return true;
    }

    public boolean deQueue(){
        if(isEmpty() == true){
            return false;
        }
        if(head == tail){
            head = -1;
            tail = -1;
            return true;
        }
        head = (head+1) % size;
        return true;
    }

    public int Front(){
        if(isEmpty() == true) return -1;
        return data[head];
    }

    public int Rear(){
        if(isEmpty() == true) return -1;
        return data[tail];
    }

    public boolean isEmpty(){
        return head == -1;
    }

    public boolean isFull(){
        return ((tail+1) % size) == head;
    }

    public static void main(String[] args){
        myCircularQueue obj = new myCircularQueue(5);
        boolean param_1 = obj.enQueue(2);
        System.out.println(param_1);
        boolean param_2 = obj.deQueue();
        System.out.println(param_2);
        int param_3 = obj.Front();
        System.out.println(param_3);
        int param_4 = obj.Rear();
        System.out.println(param_4);
        boolean param_5 = obj.isEmpty();
        System.out.println(param_5);
        boolean param_6 = obj.isFull();
        System.out.println(param_6);
    }

}