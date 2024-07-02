class Solution {

    public String longestCommonPrefix(String[] strs) {

        String value = "";

        for(int i=0; i<strs.length; i++) {

            String partValue = "";
            char currentChar = strs[i].charAt(i);
            partValue = ""+currentChar;

            for(int j=i+1; j<strs.length; j++){
                if(currentChar != strs[j].charAt(i))
                    return "";
            }   

            value = value + "" + partValue;

        }

        return value;

    }

    public static void main(String[] args){
        Solution s = new Solution();
        // String[] strs = {"flower","flow","flight"};
        // String[] strs = {""};
        String[] strs = {"a"};
        System.out.println(s.longestCommonPrefix(strs));
    }
}