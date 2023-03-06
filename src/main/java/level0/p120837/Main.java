package level0.p120837;

public class Main {

}

class Solution {
    public int solution(int hp) {
        int answer = 0;

        int 장군개미 = hp/5;
        int 병정개미 = (hp%5)/3;
        int 일개미 = (hp%5)%3;
        answer = 장군개미 + 병정개미 + 일개미;

        return answer;
    }
}