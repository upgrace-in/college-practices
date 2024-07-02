import java.util.ArrayList;

public class HashSet {

    private ArrayList<Integer> arr;

    public HashSet() {
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
}

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // int size = 100001;
        // Integer[] set = new Integer[size];
        
        // for(int i=0; i<nums.length; i++){
        //     if(set[nums[i]] != null){
        //         return true;
        //     }
        //     set[nums[i]] = nums[i];
        // }
        
        // return false;

        HashSet hashset = new HashSet();
        for (int i=0; i<nums.length; i++) {
            if (hashset.contains(nums[i])) {
                return true;
            }
            hashset.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate s = new ContainsDuplicate();
        int[] arr = {1,2,3,1};
        // int [] arr = {1,5,-2,-4,0};
        System.out.println(s.containsDuplicate(arr));
    }
}