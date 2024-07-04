import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class MinimumIndexSumOfTwoList{
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, ArrayList<String>> arr = new HashMap<>();
        int minIndexSum = Integer.MAX_VALUE;

        for(int i=0; i<list1.length; i++){
            map1.put(list1[i], i);
        }

        for(int i=0; i<list2.length; i++){
            if(map1.containsKey(list2[i])){

                int finalIndex = map1.get(list2[i]) + i;
                String[] newArray = {list2[i]};

                arr.putIfAbsent(finalIndex, new ArrayList<>());
                arr.get(finalIndex).add(list2[i]);
                minIndexSum = Math.min(minIndexSum, finalIndex);

            }
        }

        ArrayList<String> result = arr.get(minIndexSum);
        return result.toArray(new String[0]);
    }

    public void display(String[] arr){
        for(String a: arr){
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args){
        MinimumIndexSumOfTwoList m = new MinimumIndexSumOfTwoList();
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        String[] result = m.findRestaurant(list1, list2);
        m.display(result);
    }
}