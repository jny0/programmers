package level0.p120906;

public class Main {
}

//일반 풀이
class Solution {

    public int solution(int n) {     //스트림 사용
        return  (n + "")
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }


    public int solutionV2(int n) {     //스트림 사용
       return  (n + "")
                .chars()
                .map(e -> Character.getNumericValue(e))
                .sum();
    }

    public int solutionV1(int n) {
        int answer = 0;
        String nStr = n + "";
        for(int i = 0; i<nStr.length(); i++){
            char c = nStr.charAt(i);
            answer += Character.getNumericValue(c);
        }


        return answer;
    }
}
