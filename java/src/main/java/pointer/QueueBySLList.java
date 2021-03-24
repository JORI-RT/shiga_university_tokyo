package pointer;

import array.Queue;

// add removeを定数時間で実装できる
public class QueueBySLList implements Queue {
    Node head;
    Node tail;
    int n;

    @Override
    public boolean add(int x) {
        Node u = new Node(x);
        if (n == 0) {
            head = u;
        } else {
            tail.next = u;
        }

        return false;
    }

    @Override
    public int remove() {
        if (n == 0) return 0;
        int x = head.value;
        this.head = this.head.next;
        if (--n == 0) tail = null;
        return x;
    }

}
