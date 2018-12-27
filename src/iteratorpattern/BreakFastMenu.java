package iteratorpattern;

import java.util.ArrayList;

/**
 * @author zft
 * @date 2018/12/27.
 */
public class BreakFastMenu {

    private ArrayList<MenuItem> menuItems;

    BreakFastMenu() {
        menuItems = new ArrayList<MenuItem>() {
            {
                add(new MenuItem("早餐A", 1000));
                add(new MenuItem("早餐B", 2000));
            }
        };
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public BreakFastMenuIterator creatIterator(){
        return new BreakFastMenuIterator(menuItems);
    }
}
