// First In First Out - Circular Queue
public class ArrayQueue {

    int lastUpdatedIndex = 0;
    int front;
    int end;
    int maxSize = 0;
    int currentSize = 0;
    private int[] arr;

    public ArrayQueue(int size){
        maxSize = size;
        arr = new int[maxSize];
        front = 0;
        end = -1;
        currentSize = 0;
    }

    // return the first element
    public int peek(){
        return arr[front];
    }

    // printing whole queu
    void printQueue(){
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < currentSize; i++) {
            int index = (front + i) % maxSize;
            System.out.print(index + ":");
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    // check if the arr is empty
    boolean isEmpty(){
        return currentSize == 0;
    }

    // check if the arr is not full
    boolean isFull(){
        return currentSize == maxSize;
    }

    // adding element if the queue is not full
    public void enqueue(int ele){
        if(isFull()){
            System.out.println("Queue is Full!!!");
        }else{
            if(end == maxSize-1){
                end = 0;
            }else{
                end++;
            }
            arr[end] = ele;
            currentSize++;
        }
    }

    // removing the first element if the queue is not empty
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
        }else{
            front = (front + 1) % maxSize;
            currentSize--;
        }
    }
}

class myQueue {

    public static void main(String[] args){
        ArrayQueue arr = new ArrayQueue(5);
        arr.enqueue(4);
        arr.enqueue(2);
        arr.enqueue(7);
        arr.enqueue(4);
        arr.enqueue(4);
        // arr.enqueue(4); // queue is full
        arr.printQueue();
        arr.dequeue();
        arr.enqueue(18);
        arr.printQueue();
    }

}