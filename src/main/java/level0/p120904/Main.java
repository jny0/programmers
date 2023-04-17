package level0.p120904;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(29183,1));
    }
}

class Solution {
    public int solution(int num, int k) {
        int answer = 0;

        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        answer = numStr.indexOf(kStr) + 1;
        if(answer == 0) answer = -1;

        return answer;
    }
}