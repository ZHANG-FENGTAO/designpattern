package compositepattern;

/**
 * @author zft
 * @date 2018/12/27.
 */
public abstract class MenuComponent {

    // 因为对叶子节点和组合节点的实现不同，有些方法并不需要实现，所以这块最好抛出运行时异常

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getChild(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getName(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getDesc(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getPrice(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void isVegetarian(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void print(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

}
