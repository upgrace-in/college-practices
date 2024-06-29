// First In First Out
public class ArrayQueue {

    int lastUpdatedIndex = 0;
    int start = 0;
    int end = 5;
    int[] arr;

    // return the first element
    public int peek(){
        return arr[0];
    }

    // printing whole queu
    void printQueue(){
        for(int i=0; i < end; i++){
            System.out.println(arr[i]);
        }
    }

    // check if the arr is empty
    boolean isEmpty(){
        if(lastUpdatedIndex == start) 
            return true;
        return false;
    }

    // check if the arr is not full
    boolean isFull(){
        if(lastUpdatedIndex == end) 
            return true;
        return false;
    }

    // adding element if the queue is not full
    public void enqueue(int ele){
        if(isFull()){
            System.out.println("Queue is Full!!!");
        }else{
            arr[lastUpdatedIndex] = ele;
            lastUpdatedIndex++;
        }
    }

    // removing the first element if the queue is not empty
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
        }else{
            arr[start] = null;
            start++;
            end++;
        }
    }
}

class myQueue {

    public static void main(String[] args){
        ArrayQueue arr = new ArrayQueue();
        // System.out.println(arr.number(2));
    }

}