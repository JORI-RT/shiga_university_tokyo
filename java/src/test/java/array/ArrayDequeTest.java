package array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayDequeTest {
    @DisplayName("set get")
    @Test
    void test01() {
        // set get
        ArrayDeque target = new ArrayDeque(4);
        target.set(2, 2);
        target.set(3, 4);
        target.show();
        assertThat(target.get(3)).isEqualTo(4);
    }

    @DisplayName("add  remove")
    @Test
    void test02() {
        // arrange
        int[] expected = new int[]{1, 2, 5, 3};
        ArrayDeque target = new ArrayDeque(4);
        target.add(0, 1);
        target.add(1, 2);
        target.add(2, 3);
        // act
        target.add(2, 5);
        // assert
        target.show();
        assertThat(target.a).isEqualTo(expected);
    }
}
