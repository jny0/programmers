package level0.p120891;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(91230));
    }
}

class Solution {
    public int solution(int order) {
        int answer = 0;

        while(true){
            int temp = order%10;
            if( temp %3==0 && temp!=0 ){
                answer++;
            }
            if(order==0) break;
            order = temp/10;
        }

        return answer;
    }
}