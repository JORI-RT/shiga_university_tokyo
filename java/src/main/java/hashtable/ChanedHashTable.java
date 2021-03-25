package hashtable;

import IF.USet;

import java.util.Iterator;
import java.util.List;


// 性能がhashテーブルに依存、リストが全部１のときはO(1), リストが一箇所に固まった場合、O(n)
// 乗算ハッシュ　＜ー効率よく分散配置できる
public class ChanedHashTable implements USet {
    // 普遍条件
    // n <= t.length  <- リストの平均要素数は1以下
    List<Integer>[] t;
    int n;

    @Override
    public void size() {

    }

    public boolean add(int x) {
        if (find(x) != null) return false;
        if (n + 1 > t.length) resize();
        t[hash(x)].add(x);
        n++;
        return true;
    }

    @Override
    public int remove(int x) {
        return 0;
    }

    @Override
    public int finc(int x) {
        return 0;
    }

    // 実行時間はhaxh(x)の長さに比例
    Integer remove(Integer x) {
        Iterator<Integer> it = t[hash(x)].iterator();
        while (it.hasNext()) {
            Integer y = it.next();
            if (y.equals(x)) {
                it.remove();
                n--;
                return y;
            }
        }
        return null;
    }


    // 要素を２倍にして、全部入れ直す
    private void resize() {
    }


    // 0 ~ t.length-1の値を返す
    private int hash(int x) {
        return 0;
    }

    private Integer find(int x) {
        return null;
    }
}
