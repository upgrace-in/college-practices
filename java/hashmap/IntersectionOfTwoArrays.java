import java.util.ArrayList;

public class HashSetv2{

    private ArrayList<Integer> arr = new ArrayList<>();

    public void add(int key){
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

    public ArrayList<Integer> returnSet() {
        return arr;
    }

    public void display(){
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }

}


class IntersectionOfTwoArrays {
    public ArrayList<Integer> intersection(int[] nums1, int[] nums2) {

        HashSetv2 hash = new HashSetv2();
        
        // loop through the first array
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                // remove whatveer doesn't matched
                if(nums1[i] == nums2[j]){
                    hash.add(nums1[i]);
                    break;
                }
            }
        }

        hash.display();
        return hash.returnSet();

    }

    public static void main(String[] args){
        IntersectionOfTwoArrays s = new IntersectionOfTwoArrays();
        // int[] nums1 = {1,2,2,1};
        // int[] nums2 = {2,2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        s.intersection(nums1, nums2);
    }
}