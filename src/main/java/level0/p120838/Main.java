package level0.p120838;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(new Solution().solution(letter));
    }
}

class Solution {
    public String solution(String letter) {
        String[] letterArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0; i<letterArr.length; i++){
            for(int j=0; j<morse.length; j++){
                if(letterArr[i].equals(morse[j])){
                    char c = (char)(j+97);
                    letterArr[i] = String.valueOf(c);
                    break;
                }
            }
        }
        return String.join("", letterArr);
    }
}