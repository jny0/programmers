package level1.p12910;


import java.util.Arrays;

public class Main {

}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] param = new int[arr.length];

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                param[count] = arr[i];
                count++;
            }
        }

        if (count == 0) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = new int[count];
            for(int i=0; i<count; i++){
                answer[i] = param[i];
            }
            answer = Arrays.stream(answer).sorted().toArray();
            return answer;
        }
    }
}