package level1.p12925;

public class Main {
}

class Solution {
    public int solution(String s) {
        String answer = s;
        return Integer.parseInt(answer);
    }
}

//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        if(s.startsWith("+")){
//            String[] arr = s.split("\\+");
//            answer = Integer.parseInt(arr[1]);
//        } else if(s.startsWith("-")){
//            String[] arr = s.split("\\-");
//            answer = 0 - Integer.parseInt(arr[1]);
//        } else{
//            answer = Integer.parseInt(s);
//        }
//        return answer;
//    }
//}