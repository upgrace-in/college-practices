import java.util.HashMap;
import java.util.Arrays;

class TwoSum{

    public int[] twoSumOptimized(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            
            int diff = target-nums[i];
            
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] finalArr = new int[2];

        // filling the hashMap
        for(int i=0; i< nums.length; i++){
            hashMap.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int value = target - nums[i];
            if(hashMap.containsKey(value)){
                if(hashMap.get(value) != i){
                    finalArr[0] = i;
                    finalArr[1] = hashMap.get(value);
                    break;
                }
            }
        }

        return finalArr;
    }

    public void display(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args){
        TwoSum sum = new TwoSum();
        // int[] nums = {2,7,11,15};
        // int target = 9;
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = sum.twoSum(nums, target);
        sum.display(result);
    }
}