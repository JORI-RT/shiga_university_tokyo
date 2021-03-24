package pointer;

// pushとpopがO(1)で実装できる
public class StackBySLList {
    Node head;
    Node tail;
    int n;

    int push(int x) {
        Node u = new Node(x);
        u.next = this.head; // 今のHEADを一個後ろにずらす
        this.head = u; // pushした要素をheadにする
        if (n == 0) tail = u;
        n++;
        return x;
    }
}

