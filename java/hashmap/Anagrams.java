import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

class Anagrams {
    public String sortNow(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        return sortedString;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, ArrayList<String>> arr = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String sortedString = sortNow(strs[i]);
            int finalIndex = i;
            
            if(map.containsKey(sortedString)){
                finalIndex = map.get(strs[i]);
            }
            
            map.get(sortedString).add(str);
        }
        
        List<List<String>> result = new ArrayList<>(map.values());
        
        return listOfLists;
    }

    public static void main(String[] args){
        Anagrams a = new Anagrams();
        a.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}