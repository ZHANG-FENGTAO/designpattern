package compositepattern;

/**
 * Created zft on 2018/12/28.
 */
public class Waitress {

    // 顶层菜单
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
