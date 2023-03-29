package level3.p42626_힙;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] scoville = {1, 1, 4, 5, 10, 11};
        int K = 15;
        System.out.println(new Solution().solution(scoville, K));
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.offer(i);
        }

        int answer = 0;

        while (pq.size() > 1 && pq.peek() < K) {
            int a = pq.poll();
            int b = pq.poll();
            int c = a + (b * 2);

            pq.offer(c);
            answer++;
        }

        if (pq.peek() < K){
            answer = -1;
        }

        return answer;
    }
}