package level0.p120905;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}


class Solution {
    public int[] solution(int n, int[] numlist) {

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                q.add(numlist[i]);
            }
        }
        int[] answer = new int[q.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}