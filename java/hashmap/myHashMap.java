class MyHashMap{

    private int size = 1000001;
    private Integer[][] set = new Integer[size][2];

    public MyHashMap(){}

    public void put(int key, int value) {
        set[key] = new Integer[]{key, value};
    }
    
    public Integer get(int key) {
        if(set[key] == null) return -1;
        if(set[key][0] == null && set[key][1] == null) return -1;
        return set[key][1];
    }
    
    public void remove(int key) {
        set[key] = null;
    }

    public void display() {
        for (int i = 0; i < set.length; i++) {
            if (set[i] != null) {
                System.out.println("Key: " + set[i][0] + ", Value: " + set[i][1]);
            }
        }
    }

    public static void main(String[] args){
        MyHashMap obj = new MyHashMap();
        obj.put(1,1); 
        obj.put(2,2); 
        System.out.println(obj.get(1)); 
        System.out.println(obj.get(3)); 
        obj.put(2,1); 
        System.out.println(obj.get(2));
        obj.remove(2);
        System.out.println(obj.get(2));
    }
}