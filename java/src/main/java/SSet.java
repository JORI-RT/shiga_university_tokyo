public interface SSet {
    void size();

    // 要素xが集合にふくまれていなければ、集合に追加しtrueを返す。そうでなければfalseを返す
    boolean add(int x);

    // x=yとなるyがあれば、集合からyを削除しyを返す。なければnullを返す
    int remove(int x);

    // y>=xを満たす最小のyがあれば、yを返す。なければnullを返す
    // xに等しいyがなくても意味のある値を返す　　TODO　意味をしらべる　なぜか
    int finc(int x);
}
