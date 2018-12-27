package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zft
 * @date 2018/12/27.
 */
public class BreakFastMenuIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public BreakFastMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position != menuItems.size();
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }

    @Override
    public void remove() {
    }
}
