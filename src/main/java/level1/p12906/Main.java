package level1.p12906;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        System.out.println(new Solution().solution(arr));
    }
}

class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            if(i==0 || arr[i] != arr[i-1]){
                ans.add(arr[i]);
            }
        }

        int[] answer = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }

        return answer;
    }
}
