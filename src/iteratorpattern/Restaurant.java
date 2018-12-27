package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zft
 * @date 2018/12/27.
 */
public class Restaurant {

    // 遍历餐馆的餐食菜单

    public static void main(String[] args) {
        // 早餐
        BreakFastMenu breakFastMenu = new BreakFastMenu();
        ArrayList<MenuItem> menuItems = breakFastMenu.getMenuItems();
        // 可以使用增强for,但是没必要
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }

        // 晚餐
        DinnerMenu dinnerMenu = new DinnerMenu();
        MenuItem[] dinnerMenuItems = dinnerMenu.getMenuItems();
        for (int i = 0; i < dinnerMenuItems.length; i++) {
            System.out.println(dinnerMenuItems[i].toString());
        }


        // 使用迭代器模式  迭代器模式  隐藏了对象的内部具体实现
        BreakFastMenu breakFastMenu2 = new BreakFastMenu();
        BreakFastMenuIterator breakFastMenuIterator = breakFastMenu2.creatIterator();
        iterator(breakFastMenuIterator);
        DinnerMenu dinnerMenu2 = new DinnerMenu();
        DinnerMenuIterator dinnerMenuIterator = dinnerMenu2.creatDinnerMenuIterator();
        iterator(dinnerMenuIterator);
    }

    private static void iterator(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println("迭代器模式---->" + iterator.next());
        }
    }
}
