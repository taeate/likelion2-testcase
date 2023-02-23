package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("2,3 => -1")
    void Test1() {
        assertThat(new Solution().solution(2,3)).isEqualTo(-1);
    }
    @Test
    @DisplayName("11,11 => 1")
    void Test2() {
        assertThat(new Solution().solution(11,11)).isEqualTo(1);
    }
    @Test
    @DisplayName("7,99 => -1")
    void Test3() {
        assertThat(new Solution().solution(7,99)).isEqualTo(-1);
    }
}
