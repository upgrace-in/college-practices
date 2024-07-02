import java.util.ArrayList;

public class HashSet{

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

        HashSet hash = new HashSet();
        
        // loop through the first array
        for(int i=0; i<nums1.length; i++){
            // add the items
            hash.add(nums1[i]);

            for(int j=0; j<nums2.length; j++){
                // remove whatveer doesn't matched
                if(hash.contains(nums2[j]) == false)
                    hash.remove(nums1[i]);
            }
        }

        hash.display();
        return hash.returnSet();

    }

    public static void main(String[] args){
        IntersectionOfTwoArrays s = new IntersectionOfTwoArrays();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        s.intersection(nums1, nums2);
    }
}