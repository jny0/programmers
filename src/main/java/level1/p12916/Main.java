package level1.p12916;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("pPoooyY"));



    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int countP = 0;
        int countY = 0;

        for (char c : s.toCharArray()) {
            if(c=='p'||c=='P') countP++;
            else if(c=='y'||c=='Y') countY++;
        }
        if(countY==countP) answer = true;

        return answer;
    }
}
