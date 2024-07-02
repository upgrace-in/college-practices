public class HashSet {

    private boolean[] set = new boolean[1000001];

    public HashSet(){}

    public void add(int key){
        set[key] = true;
    }

    public void remove(int key){
        set[key] = false;
    }

    public boolean contains(int key){
        return set[key];
    }

    public void display(){
        for(int i=0; i<set.length; i++){
            System.out.println(set[i]);
        }
    }

}

class SingleNumber {

    public int singleNumber(int[] nums) {

        // OPTIMIZE SOLUTION
        for(int i=1;i<nums.length;i++){
            nums[0] ^= nums[i];
        }
        return nums[0];

        // BRUTE FORCE SOLUTION
        // if(nums.length == 0) return nums[0];

        // HashSet hashset = new HashSet();

        // for (int i=0; i<nums.length; i++) {
        //     if(hashset.contains(nums[i]))
        //         hashset.remove(nums[i]);
        //     else
        //         hashset.add(nums[i]);
        // }

        // for (int i=0; i<nums.length; i++) {
        //     if(hashset.contains(nums[i]))
        //         return nums[i];
        // }

        // return 0;

    }

    public static void main(String[] args){
        SingleNumber s = new SingleNumber();
        int[] arr = {2,2,1};
        // int[] arr = {4,1,2,1,2};
        System.out.println(s.singleNumber(arr));
    }
}