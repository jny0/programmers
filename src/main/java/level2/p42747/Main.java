package level2.p42747;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(new Solution().solution(citations));
    }
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            if(citations.length-1 - i == citations[i]){
                answer = citations[i];
                break;
            }else if(citations.length-1 - i < citations[i]){
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}