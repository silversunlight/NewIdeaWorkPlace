import java.util.ArrayDeque;
import java.util.ArrayList;
//输入一个链表，从尾到头打印链表每个节点的值。
public class FromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        while (listNode != null) {
            arrayDeque.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!arrayDeque.isEmpty()) {
            list.add(arrayDeque.pop());
        }
        return list;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


}
