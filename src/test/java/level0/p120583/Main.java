package level0.p120583;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Main {
    @Test
    @DisplayName("1, 1, 2, 3, 4, 5")
    void t1() {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n  = 1;
        assertThat(new Solution().solution(array,n)).isEqualTo(2);
    }

    @Test
    @DisplayName("0, 2, 3, 4")
    void t2() {
        int[] array = {0, 2, 3, 4};
        int n  = 1;
        assertThat(new Solution().solution(array,n)).isEqualTo(0);
    }
}
