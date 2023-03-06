package level0.p120841;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1,1")
    void t1() {
        int[] dot = {1,1};
        assertThat(new Solution().solution(dot)).isEqualTo(1);
    }
    @Test
    @DisplayName("-1,1")
    void t2() {
        int[] dot = {-1,1};
        assertThat(new Solution().solution(dot)).isEqualTo(2);
    }
}
