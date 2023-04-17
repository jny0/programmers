package level2.p87377;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("교점 [[1, -1, 0], [2, -1, 0]]")
    void t001() {
        Object assertThat;
        assertThat(new Solution()
                .intersection(new int[]{1,-1,0}, new int[]{2,-1,0}))
                .isEqualTo(new int[]{0,0});
    }
}
