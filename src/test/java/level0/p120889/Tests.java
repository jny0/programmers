package level0.p120889;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("3,4,5")
    void t1() {
        int[] sides = {3,4,5};
        assertThat(new Solution().solution(sides)).isEqualTo(1);
    }
    @Test
    @DisplayName("3,3,3")
    void t2() {
        int[] sides = {3,3,3};
        assertThat(new Solution().solution(sides)).isEqualTo(1);
    }
    @Test
    @DisplayName("1,2,4")
    void t3() {
        int[] sides = {1,2,4};
        assertThat(new Solution().solution(sides)).isEqualTo(2);
    }
}
