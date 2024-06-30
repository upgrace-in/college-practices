import java.util.ArrayList;

class MyHashSet {

    private ArrayList<Integer> arr;

    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == key)
                return;
        }
        arr.add(key);
    }
    
    public void remove(int key) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == key)
                arr.remove(i);
        }
    }
    
    public boolean contains(int key) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        MyHashSet obj = new MyHashSet();
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