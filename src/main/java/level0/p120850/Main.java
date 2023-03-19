package level0.p120850;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solutionV2("hi12392"));
    }
}

class Solution {
    public List solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("[0-9]"); // 정규표현식 문자열로 패턴 객체 생성
        Matcher matcher = pattern.matcher(my_string); // 패턴 객체로 문자열을 필터링한뒤 그 결과값들을 담은 매처 객체 생성

        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group()));
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public int[] solutionV2(String my_string) {
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        Arrays.sort(arr);

        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}


