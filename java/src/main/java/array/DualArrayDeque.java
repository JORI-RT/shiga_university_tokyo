package array;

import java.util.List;

/**
 * 例
 * 1 2 3 4 5 6 7 8 9
 *
 * front 4 3 2 1
 * bacl  5 6 7 8 9
 *
 * get(3) -> 4
 * get(5) -> 6
 */
public class DualArrayDeque {
    List<Integer> front; // 0 ~ front.size()-1の要素を逆順にいれる
    List<Integer> back; // front.size ~ size() -1 を順にいれる

    public int size() {
        return front.size() + back.size();
    }

    // O(1)
    public int get(int i) {
        if (i < front.size()) {
            return front.get(front.size() - i - 1);
        } else {
            return back.get(i - front.size());
        }
    }

}
