import java.util.HashMap;

class Solution {

    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("LVIII"));
    }

    public int romanToInt(String s) {
        // declare the dictionary with symbol & value
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // loop throught the string from backwards
        int lengthOfString = s.length();
        int i = lengthOfString - 1;
        int num = 0;
        while(i != -1){

            char item = s.charAt(i);
            int itemValue = map.get(item);

            num += itemValue;

            if(i-1 > -1){
                char nextItem = s.charAt(i-1);
                int nextItemValue = map.get(nextItem);
                if(nextItemValue < itemValue){
                    num -= nextItemValue;
                    i--;
                }
            }

            i--;
        }
        
        return num;
    }

    
}