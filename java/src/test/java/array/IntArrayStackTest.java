package array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntArrayStackTest {
    @DisplayName("get, setのテスト")
    @Test
    void test1() {
        ArrayStack ias = new ArrayStack(3);
        ias.set(1, 4);
        assertThat(ias.get(0)).isEqualTo(0);
        assertThat(ias.get(1)).isEqualTo(4);
        assertThat(ias.get(2)).isEqualTo(0);
    }

    @DisplayName("addのテスト")
    @Test
    void test2() {
        // arrange
        ArrayStack ias = new ArrayStack(3);
        ias.set(0, 3);
        ias.set(1, 5);
        ias.set(2, 9);
        // act
        ias.add(1, 8);
        // assert
        assertThat(ias.get(0)).isEqualTo(3);
        assertThat(ias.get(1)).isEqualTo(8);
        assertThat(ias.get(2)).isEqualTo(5);
        assertThat(ias.get(3)).isEqualTo(9);
    }

    @DisplayName("removeのテスト")
    @Test
    void test3() {
        // arrange
        ArrayStack ias = new ArrayStack(3);
        ias.set(0, 3);
        ias.set(1, 5);
        ias.set(2, 9);
        // act
        assertThat(ias.remove(1)).isEqualTo(5);
        // assert
        assertThat(ias.get(0)).isEqualTo(3);
        assertThat(ias.get(1)).isEqualTo(9);
    }

    @Test
    void name() {
        new ArrayQueue2(1);
    }
}