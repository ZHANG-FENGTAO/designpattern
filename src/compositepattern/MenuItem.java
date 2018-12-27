package compositepattern;

/**
 * @author zft
 * @date 2018/12/27.
 */
public class MenuItem extends MenuComponent {

    String name;
    String desc;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void getName(MenuComponent menuComponent) {
        super.getName(menuComponent);
    }

    @Override
    public void getDesc(MenuComponent menuComponent) {
        super.getDesc(menuComponent);
    }

    @Override
    public void getPrice(MenuComponent menuComponent) {
        super.getPrice(menuComponent);
    }

    @Override
    public void isVegetarian(MenuComponent menuComponent) {
        super.isVegetarian(menuComponent);
    }

    @Override
    public void print(MenuComponent menuComponent) {
        super.print(menuComponent);
    }
}
