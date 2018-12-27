package compositepattern;

/**
 * @author zft
 * @date 2018/12/27.
 */
public class CompositeClient {

    /*
        组合模式：允许将对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户=一致的方式处理个别对象以及对象组合
     */

    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("PANCAKE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");
        MenuComponent allMenus = new Menu("All MENUS", "All menus combined");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("面食", "意大利面", true, 1300));
        // 给本菜单添加甜点菜单
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("苹果酱","苹果酱",true,1000));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}
