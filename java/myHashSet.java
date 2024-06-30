class MyHashSet {

    private Integer[] arr;
    private int size = 0;
    private int currentSize = -1;

    public MyHashSet(int mySize) {
        size = mySize;
        arr = new Integer[size];
    }
    
    public void add(int key) {
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i] == key)
                return;
        }
        currentSize++;
        arr[currentSize] = key;
    }
    
    public void remove(int key) {
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i] == key)
                arr[i] = null;
        }
    }
    
    public boolean contains(int key) {
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i] == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        MyHashSet obj = new MyHashSet(10);
        obj.add(1);
        System.out.println(obj.contains(1));
        obj.remove(1);
        System.out.println(obj.contains(1));
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */