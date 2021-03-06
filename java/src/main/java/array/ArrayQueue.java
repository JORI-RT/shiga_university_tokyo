package array;

import java.util.Arrays;
import java.util.NoSuchElementException;

// 循環配列で削除する要素を追跡
// 入らなくなったらresize
public class ArrayQueue implements Queue, ArrayViewer {
    int[] a; // 循環配列
    int j; // 削除する要素
    int n; // 要素数

    public ArrayQueue(int cap) {
        this.a = new int[cap];
    }

    @Override
    public boolean add(int x) {
        if (n + 1 > a.length) resize();
        a[(j + n) % a.length] = x;
        n++;
        return true;
    }

    @Override
    public int remove() {
        if (n == 0) throw new NoSuchElementException();
        a[j] = 0;
        j = (j + 1) % a.length;
        return a[j];
    }

    private void resize() {
    }

    @Override
    public void show() {
        ArrayUtils.show(a);
    }
}
