package level1.p86051;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,6,7,8,0};
        System.out.println(new Solution().solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int index = 0;
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++){
            while(numbers[i] > index+1){
                answer += index;
                index++;
            }
        }
        return answer;
    }
}