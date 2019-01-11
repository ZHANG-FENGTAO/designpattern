package statepattern;

/**
 * @author zft
 * @date 2019/1/11.
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("错误：不能投入硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("硬币 退回");
        // 转换状态 没有硬币
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCranK() {
        System.out.println("转动曲柄...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("错误：没有糖果可发放");
    }
}
