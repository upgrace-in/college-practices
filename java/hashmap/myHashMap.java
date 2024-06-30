class MyHashMap{

    public MyHashMap(){

    }

    public void put(int key, int value) {
        
    }
    
    public int get(int key) {
        return 0;
    }
    
    public void remove(int key) {
        
    }

    public static void main(String[] args){
        MyHashMap obj = new MyHashMap();
        obj.put(2,1); // 2=>KEY, 1=>Value
        System.out.println(obj.get(2));
        obj.remove(1);
        System.out.println(obj.get(2));
    }
}