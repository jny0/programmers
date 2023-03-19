package level0.p120839;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("205"));
    }
}

class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i= 0; i<rsp.length(); i++){
            if( rsp.charAt(i) == '2' ) answer += '0';
            else if( rsp.charAt(i) == '5' ) answer += '2';
            else if( rsp.charAt(i) == '0' ) answer += '5';
        }
        return answer;
    }
}