package array;

import java.util.Arrays;
import java.util.NoSuchElementException;

// 見ないで実装
public class ArrayQueue2 implements Queue, ArrayViewer {
    // 循環配列で削除する要素を追跡
// 入らなくなったらresize
    int[] a; // 循環配列
    int j; // 削除する要素
    int n; // 要素数

    public ArrayQueue2(int cap) {
        this.a = new int[cap];
    }

    @Override
    public void show() {
        ArrayUtils.show(this.a);
    }

    @Override
    public boolean add(int x) {
        return false;
    }

    @Override
    public int remove() {
        return 0;
    }
}
