package algorithmsAnalysis.dataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 一个自己实现的ArraysList
 * @param <AnyType>
 */
public class MyArraylist<AnyType> implements Iterable<AnyType> {
    public static final int DEFAULT_CAPACITY = 10;
    //theSize 只是单纯代表元素个数，所以只随着add和remove变化，
    // 这个类没有实现capacity的输出
    private int theSize;
    private AnyType[] theItems;

    public MyArraylist() {
        doClear();
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void trimToSize() {
        ensureCapacity(size());
    }


    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }


    public AnyType get(int index) {
        if (index<0||index>=size())
            throw new ArrayIndexOutOfBoundsException();
        return theItems[index];
    }

    public AnyType set(int index, AnyType newVal) {
        if (index<0||index>=size())
            throw new ArrayIndexOutOfBoundsException();
        AnyType old = theItems[index];
        theItems[index]=newVal;
        return old;
    }
    private void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize) return;
        AnyType[] old = theItems;
        theItems = (AnyType[]) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            theItems[i] = old[i];
        }
    }

    public boolean add(AnyType x) {
        add(size(), x);
        return true;
    }

    public void add(int index, AnyType x) {
        if (theItems.length==size())
            ensureCapacity(size() * 2 + 1);
        for (int i = theSize; i > index; i--) {
            theItems[i] = theItems[i - 1];
        }
        theItems[index]=x;
        theSize++;
    }

    public AnyType remove(int index) {
        AnyType removedItem = theItems[index];
        for (int i = index; i < size() - 1; i++) {
            theItems[i] = theItems[i + 1];
        }
        theSize--;
        return removedItem;
    }

    @Override
    public Iterator<AnyType> iterator() {
        return new ArrayListIterator();
    }



    private  class ArrayListIterator implements Iterator<AnyType> {

        private int current=0;
        @Override
        public boolean hasNext() {
            return current<size();
        }

        @Override
        public AnyType next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return theItems[current++];
        }

        @Override
        public void remove() {
            MyArraylist.this.remove(--current);
        }
    }
}
