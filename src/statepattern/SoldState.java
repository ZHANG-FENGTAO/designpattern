package statepattern;

/**
 * @author zft
 * @date 2019/1/11.
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCranK() {

    }

    @Override
    public void dispense() {

    }
}
