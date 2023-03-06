package level0.p120825;

public class Main {
    public static void main(String[] args) {
        System.out.printf(new Solution().solution("abcde",3));
    }
}
class Solution {
    public String solution(String my_string, int n) {

        int count=1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < my_string.length(); i++){
            while(count<=n){
                sb.append((my_string.charAt(i)));
                count++;
            }
            count = 1;
        }

        return sb.toString();
    }
}