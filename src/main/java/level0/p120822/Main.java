package level0.p120822;

public class Main {
    public static void main(String[] args) {
        System.out.printf(new Solution().solution("abcde"));
    }
}

class Solution {
    public String solution(String my_string) {

        StringBuffer sb = new StringBuffer();
        for (int i = my_string.length()-1;i>=0; i--){
            sb.append((my_string.charAt(i)));
        }
        return sb.toString();
    }
}