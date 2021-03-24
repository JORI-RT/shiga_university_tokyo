package pointer;

public class DLList {
    int n;
    Node dummy;

    public DLList() {
        DNode dummy = new DNode();
        dummy.next = dummy;
        dummy.prev = dummy;

    }
}
