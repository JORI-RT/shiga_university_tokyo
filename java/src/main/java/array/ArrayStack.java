package array;

import java.util.Arrays;

public class ArrayStack {
    private int[] a;  // 要素数より大きい必要がある
    private int n; // 要素数

    public ArrayStack(int cap) {
        this.a = new int[cap];
    }


    // O(1)
    public int get(int i) {
        return a[i];
    }

    // O(1)
    public int set(int i, int x) {
        int y = a[i];
        a[i] = x;
        n++;
        return y;
    }

    // O(n-i)
    public void add(int i, int x) {
        if (n + 1 > a.length) resize();
        for (int y = n; y > i; y--) {
            a[y] = a[y - 1];
        }
        a[i] = x;
//        System.out.println("b = " + Arrays.toString(this.a));
    }

    private void resize() {
        int[] b = new int[2 * n];
        System.arraycopy(a, 0, b, 0, this.a.length);
        this.a = b;
//        System.out.println("b = " + Arrays.toString(this.a));
    }

    // O(n-i)
    public int remove(int i) {
        int ret = a[i];
        for (int y = i; y < n - 1; y++) {
            a[y] = a[y + 1];
        }
        a[n - 1] = 0;
//        System.out.println(Arrays.toString(this.a));
        //TODO  resize
        return ret;
    }
}
