import java.util.HashSet;

class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        int m, result = 0;
        while(n != 1){
            while(n != 0){
                m = n % 10;
                n /= 10;
                result += Math.pow(m, 2);
            }
            if(set.contains(result)) return false;
            set.add(result);
            n = result;
            result = 0;
        }

        return true;
    }

    public static void main(String[] args){
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19));
    }
}