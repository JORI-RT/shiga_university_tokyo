package array;

public class ArrayDeque implements ArrayDebugger {
    int[] a;
    int j;
    int n;

    public ArrayDeque(int cap) {
        a = new int[cap];
    }

    @Override
    public void show() {
        ArrayUtils.show(a);
        System.out.println("j = " + j);
        System.out.println("n = " + n);
    }

    public void set(int i, int x) {
        a[(j + i) % a.length] = x;
    }

    public int get(int i) {
        return a[(j + i) % a.length];
    }


    // TODO
    public void remove(int i) {

    }

    public void add(int i, int x) {
        if (n + 1 > a.length) resize();
        if (i < n / 2) { // left shift
            // ｊが０のときは要素をaの末尾に挿入する必要があるため、索状位置を
            j = (j == 0) ? a.length - 1 : j - 1;
            for (int k = 0; k < i; i++) {
                a[(j + i) % a.length] = a[(j + i + 1) % a.length];
            }
        } else { // right shift
            for (int k = n; k > i; k--) {
                a[j + k % a.length] = a[(j + k - 1) % a.length];
            }
        }
        a[j + i % a.length] = x;
        n++;
    }

    // TODO
    private void resize() {

    }
}
