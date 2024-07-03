import java.util.HashMap;

// three ways for getting length acc to data types:
// arr.length
// map.size()
// string.length()

class IsomorphicStrings{
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            if(!map.containsValue(t.charAt(i))){
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }

        return true;
    }

    public static void main(String[] args){
        IsomorphicStrings s = new IsomorphicStrings();
        // String f = "paper";
        // String t = "title";
        // String f = "bbbaaaba";
        // String t = "aaabbbba";
        // String f = "a";
        // String t = "a";
        // String f = "ab";
        // String t = "ab";
        // String f = "badc";
        // String t = "baba";
        System.out.println(s.isIsomorphic(f, t));
    }
}