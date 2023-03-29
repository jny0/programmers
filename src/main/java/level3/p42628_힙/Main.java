package level3.p42628_힙;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] operations = sc.nextLine()
                .replace("\"", "")
                .replace("[", "")
                .replace("]", "")
                .split(", ");


        System.out.println(Arrays.toString(new Solution().solution(operations)));
    }
}

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> pqMin = new PriorityQueue<>();
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("I")) {
                String[] strings = operations[i].split(" ");
                pqMin.offer(Integer.parseInt(strings[1]));
                pqMax.offer(Integer.parseInt(strings[1]));
            } else if (operations[i].equals("D -1")) {
                pqMax.remove(pqMin.poll());
            } else if (operations[i].equals("D 1")) {
                pqMin.remove(pqMax.poll());
            }
        }


        if (!(pqMin.isEmpty() && pqMax.isEmpty())){
            answer[0] = pqMax.peek();
            answer[1] = pqMin.peek();
        }

        return answer;
    }
}