package level0.p120849;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("bus")
    void t1() {
        String my_string = "bus";
        assertThat(new Solution().solution(my_string)).isEqualTo("bs");
    }
    @Test
    @DisplayName("nice to meet you")
    void t2() {
        String my_string = "nice to meet you";
        assertThat(new Solution().solution(my_string)).isEqualTo("nc t mt y");
    }
}
