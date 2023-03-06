package level1.p12910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{5, 9, 7, 10}")
     void t1() {
        int[] arr = {5, 9, 7, 10};
        int[] answer = {5,10};
        assertThat(new Solution().solution(arr,5)).isEqualTo(answer);
    }

    @Test
    @DisplayName("{2, 36, 1, 3}")
    void t2() {
        int[] arr = {2, 36, 1, 3};
        int[] answer = {1, 2, 3, 36};
        assertThat(new Solution().solution(arr,1)).isEqualTo(answer);
    }


    @Test
    @DisplayName("{3,2,6}")
    void t3() {
        int[] arr = {3,2,6};
        int[] answer = {-1};
        assertThat(new Solution().solution(arr,10)).isEqualTo(answer);
    }


}
