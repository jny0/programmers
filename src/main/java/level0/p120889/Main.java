package level0.p120889;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }

}

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[0]+sides[1]>sides[2]) return 1;
        else return 2;
    }
}