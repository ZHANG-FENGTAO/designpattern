package compositepattern;

import java.util.ArrayList;

/**
 * Created zft on 2018/12/28.
 */
public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String desc;

    Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDesc());
        System.out.println("---------------");
        // 遍历的打印出菜单及其菜单项
        menuComponents.forEach(MenuComponent::print);
    }
}
