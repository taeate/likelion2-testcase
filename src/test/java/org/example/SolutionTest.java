package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("70도가 입력되었을떄 결과는 1")
    void Test1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);

    }
    @Test
    @DisplayName("91도가 입력되었을떄 결과는 3")
    void Test2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);

    }

    @Test
    @DisplayName("180도가 입력되었을떄 결과는 4")
    void Test3() {
        assertThat(new Solution().solution(180)).isEqualTo(4);

    }
}
