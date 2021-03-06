package array;

import java.util.NoSuchElementException;

// add removeがO(1)
public class ArrayQueue2 implements Queue, ArrayDebugger {
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
        System.out.println("n = " + n);
        System.out.println("j = " + j);
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
        int ret = a[j];
        a[j] = 0;
        n--;
        j = (j + 1) % a.length;
        return ret;
    }

    private void resize() {
        int[] b = new int[2 * n];
        for (int i = 0; i < n; i++) {
            b[i] = a[j + i];
        }
        a = b;
        j = 0;
    }
}
