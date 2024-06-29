public class Stack{
    private int[] arr;
    int maxSize;
    int currentIndex;

    public Stack(int size){
        maxSize = size;
        arr = new int[size];
        currentIndex = -1;
    }

    boolean isFull(){
        return currentIndex == maxSize;
    }

    // push the element from the end of the arr
    void push(int ele){
        if(isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        currentIndex++;
        arr[currentIndex] = ele;
    }

    // return after removing the top element
    int pop(){
        if(isEmpty()){
            System.out.println("Stack if Empty!");
            return -1;
        }
        int item = arr[currentIndex];
        currentIndex--;
        return item;
    }

    // return top element without removing it
    int peek(){
        if(isEmpty()){
            System.out.println("Stack if Empty!");
            return -1;
        }
        return arr[currentIndex];
    }

    boolean isEmpty(){
        return currentIndex == 0;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }
        for(int i=0; i<=currentIndex; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

class myStack {
    public static void main(String[] args){
        Stack stk = new Stack(5);
        stk.push(4);
        stk.push(2);
        stk.push(7);
        stk.push(4);
        stk.push(2);
        // stk.push(2); // Stack is Full
        // System.out.println(stk.pop());
        System.out.println(stk.peek());
        stk.display();
    }
}