package iteratorpattern;

/**
 * @author zft
 * @date 2018/12/27.
 */
public class DinnerMenu {

    private MenuItem[] menuItems = new MenuItem[2];

    DinnerMenu() {
        menuItems[0] = new MenuItem("晚餐A", 3000);
        menuItems[1] = new MenuItem("晚餐B", 4000);
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public DinnerMenuIterator creatDinnerMenuIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
