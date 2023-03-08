package level0.p120851;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");

        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }
        return answer;
    }

    public int solution_stream(String myString) {
        return myString.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .mapToInt(Integer::valueOf)
                .sum();
    }
}