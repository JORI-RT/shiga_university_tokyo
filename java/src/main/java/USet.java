// UnorderdSet
public interface USet {
    void size();

    // 要素xが集合にふくまれていなければ、集合に追加しtrueを返す。そうでなければfalseを返す
    boolean add(int x);

    // x=yとなるyがあれば、集合からyを削除しyを返す。なければnullを返す
    int remove(int x);

    // x=yとなるyがあれば、yを返す。なければnullを返す
    int finc(int x);
}
