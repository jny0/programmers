package level0.p120851;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1a2b3c4d123")
    void t1() {
        assertThat(new Solution().solution("1a2b3c4d123")).isEqualTo(16);
    }
    @Test
    @DisplayName("aAb1B2cC34oOp")
    void t2() {
        assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(10);
    }
}
