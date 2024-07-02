import java.util.HashSet;

class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int x:nums1)
            set1.add(x);

        for(int x:num2)
            if(set1.contains(x))
                set2.add(x);

        int[] arr = new int[set2.size()];
        int i = 0;
        for(int x: set2){
            arr[i] = x;
            i++;
        }

        return arr;
        
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