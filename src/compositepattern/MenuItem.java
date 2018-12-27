package compositepattern;

/**
 * 菜单项
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
    public String getName() {
        return name;
    }
    @Override
    public String getDesc() {
        return desc;
    }
    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(){
        System.out.println(" "+getName());
        if (isVegetarian()){
            System.out.println("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("  --"+getPrice());
    }
}
