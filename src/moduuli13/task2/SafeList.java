package moduuli13.task2;

import java.util.ArrayList;
import java.util.List;

public class SafeList<E> {

    private final List<E> list = new ArrayList<>();

    public synchronized void addItem(E element) {
        list.add(element);
    }

    public synchronized int getSize() {
        return list.size();
    }

    public synchronized void removeItem(E element) {
        list.remove(element);
    }
}
