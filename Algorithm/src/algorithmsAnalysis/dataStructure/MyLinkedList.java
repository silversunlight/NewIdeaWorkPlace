package algorithmsAnalysis.dataStructure;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {

    private int theSize;
    private int modCount=0;
    private Node<AnyType> beginMarker;
    private Node<AnyType> endMarker;

    private static class Node<AnyType> {
        public AnyType data;
        public Node<AnyType> prev;
        public Node<AnyType> next;

        public Node(AnyType d, Node<AnyType> p, Node<AnyType> n) {
            data = d;
            prev = p;
            next = n;
        }
    }


    public MyLinkedList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    public int size() {
        return  theSize;
    }

    public boolean isEmpry() {
        return size()==0;
    }

    public boolean add(AnyType x) {
        add(size(),x);
        return true;
    }

    public void add(int index, AnyType x) {
        addBefore(getNode(index, 0, size()), x);
    }

    public AnyType get(int index) {
        return getNode(index).data;
    }

    public AnyType set(int index, AnyType newVal) {
        Node<AnyType> p = getNode(index);
        AnyType old=p.data;
        p.data=newVal;
        return old;
    }

    public AnyType remove(int index) {
        return remove(getNode(index));
    }

    private AnyType remove(Node<AnyType> p) {
        p.next.prev=p.prev;
        p.prev.next=p.next;
        theSize--;
        modCount++;
        return p.data;
    }

    private void addBefore(Node<AnyType> p, AnyType x) {
        Node<AnyType> newNode = new Node<>(x, p.prev, p);
        newNode.prev.next=newNode;
        p.prev=newNode;
        theSize++;
        modCount++;
    }

    private Node<AnyType> getNode(int index) {
        return getNode(index, 0, size() - 1);
    }
    private Node<AnyType> getNode(int index, int lower, int upper) {
        Node<AnyType> p;
        if (index<lower||index>upper)
            throw new IndexOutOfBoundsException();
        if (index < size() / 2) {
            p = beginMarker.next;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
        } else {
            p=endMarker;
            for (int i = size(); i > index; i--) {
                p=p.prev;
            }
        }
        return p;
    }

    private void doClear() {
        beginMarker = new Node<>(null, null, null);
        endMarker = new Node<>(null, beginMarker, null);
        beginMarker.next=endMarker;

        theSize=0;
        modCount++;
    }

    @Override
    public Iterator<AnyType> iterator() {
        return new LinkedListIteraor();
    }

    private class LinkedListIteraor implements Iterator<AnyType> {

        private Node<AnyType> current=beginMarker.next;
        private int expectedModCount=modCount;
        private boolean okToRemove=false;
        @Override
        public boolean hasNext() {
            return current!=endMarker;
        }

        @Override
        public AnyType next() {
           if (modCount!=expectedModCount)
               throw new ConcurrentModificationException();
           if (!hasNext())
               throw new NoSuchElementException();

           AnyType nextItem=current.data;
           current=current.next;
           okToRemove=true;
           return nextItem;
        }

        @Override
        public void remove() {
            if (modCount!=expectedModCount)
                throw new ConcurrentModificationException();
            if (!okToRemove)
                throw new IllegalStateException();
            MyLinkedList.this.remove(current.prev);
            expectedModCount++;
            okToRemove=false;
        }
    }
}
