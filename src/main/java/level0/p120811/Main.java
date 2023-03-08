package level0.p120811;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];

        return answer;
    }
}