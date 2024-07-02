import java.util.Arrays;

class Solution {

    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args){
        Solution s = new Solution();
        // String[] strs = {"flower","flow","flight"};
        // String[] strs = {""};
        // String[] strs = {"a"};
        // String[] strs = {"",""};
        String[] strs = {"ab", "a"};
        System.out.println(s.longestCommonPrefix(strs));
    }
}