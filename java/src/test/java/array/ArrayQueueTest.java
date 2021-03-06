package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


class ArrayQueueTest {
    @Test
    void name() {
        ArrayQueue2 target = new ArrayQueue2(3);

        // resizeで配列がのびることを確認
        target.add(2);
        target.add(5);
        target.add(6);
        target.add(7);
        target.show();
        int[] expected = new int[]{2, 5, 6, 7, 0, 0};
        assertThat(target.a).isEqualTo(expected);

        // 循環することの確認
        target.remove();
        target.add(6);
        target.add(9);
        target.add(3);
        target.show();
        target.remove();
        expected = new int[]{3, 0, 6, 7, 6, 9};
        assertThat(target.a).isEqualTo(expected);
        assertThat(target.j).isEqualTo(2);

    }
}
