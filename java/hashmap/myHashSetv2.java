class MyHashSetv2{

    private boolean[] set = new boolean[1000001];

    public MyHashSetv2(){}

    public void add(int key){
        set[key] = true;
    }

    public void remove(int key){
        set[key] = false;
    }

    public boolean contains(int key){
        return set[key];
    }

    public static void main(String[] args){
        MyHashSetv2 obj = new MyHashSetv2();
        obj.add(1);
        System.out.println(obj.contains(1));
        obj.remove(1);
        System.out.println(obj.contains(1));
    }

}