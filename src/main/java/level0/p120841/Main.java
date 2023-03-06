package level0.p120841;
// 점의 위치 구하기 https://school.programmers.co.kr/learn/courses/30/lessons/120841
public class Main {
    public static void main(String[] args) {

    }

}

class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int answer=0;

        if(x>0 && y>0) answer= 1;
        else if(x<0 && y>0) answer= 2;
        else if(x<0 && y<0) answer= 3;
        else if(x>0 && y<0) answer= 4;

        return answer;
    }
}