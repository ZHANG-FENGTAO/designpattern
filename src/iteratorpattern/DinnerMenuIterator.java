package iteratorpattern;

import java.util.Iterator;

/**
 * @author zft
 * @date 2018/12/27.
 */
public class DinnerMenuIterator implements Iterator {

    private MenuItem[] menuItems;

    private int position;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position != menuItems.length;
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }

    @Override
    public void remove() {

    }
}
