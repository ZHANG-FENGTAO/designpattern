package statepattern;

/**
 * @author zft
 * @date 2019/1/11.
 */
public class GumballMachine {

///    /**
///     * 售罄
///     */
///    final static int SOLD_OUT = 0;
///    /**
///     * 机器没有钱
///     */
///    final static int NO_QUARTER = 1;
///    /**
///     * 机器有钱
///     */
///    final static int HAS_QUARTER = 2;
///    /**
///     * 售出
///     */
///    final static int SOLD = 3;
///
///
///    /**
///     * 记录糖果机中剩余的糖果数量
///     */
///    int count = 0;
///    /**
///     * 记录糖果机当前状态
///     */
///    int state = SOLD_OUT;
///
///
///    public GumballMachine(int count) {
///        this.count = count;
///        if (count > 0) {
///            state = NO_QUARTER;
///        }
///    }
///
///    /**
///     * 投入硬币
///     */
///    private void insertQuarter() {
///        if (state == HAS_QUARTER) {
///            System.out.println("you can't insert another quarter");
///        } else if (state == NO_QUARTER) {
///            System.out.println("you insert quarter");
///        } else if (state == SOLD_OUT) {
///            System.out.println("you can't insert a quarter, the machine is sold out");
///        } else if (state == SOLD) {
///            System.out.println("please wait,we're already giving you a gumball");
///        }
///    }
///
///    /**
///     * 退出硬币
///     */
///    private void ejectQuarter() {
///        if (state == HAS_QUARTER) {
///            System.out.println("quarter returned");
///        } else if (state == NO_QUARTER) {
///            System.out.println("you haven't inserted a quarter");
///        } else if (state == SOLD) {
///            System.out.println("sorry,you already turned the crank");
///        } else if (state == SOLD_OUT) {
///            System.out.println("the gumball is sold out");
///        }
///    }
///
///    /**
///     * 转动曲柄 获取糖果
///     */
///    private void turnCrank() {
///        if (state == SOLD) {
///            System.out.println("you can't take another gumball");
///        } else if (state == NO_QUARTER) {
///            System.out.println("you should give a quarter");
///        } else if (state == SOLD_OUT) {
///            System.out.println("the gumball machine is sold out");
///        } else if (state == HAS_QUARTER) {
///            System.out.println("you can turn,take the gumball");
///            state = SOLD;
///            dispense();
///        }
///    }
///
///    /**
///     * 发放糖果
///     */
///    private void dispense() {
///        if (state == SOLD) {
///            System.out.println("A gumball comes rolling out the slot");
///            count = count - 1;
///            if (count == 0) {
///                state = SOLD_OUT;
///            } else {
///                // 回到初始状态
///                state = NO_QUARTER;
///            }
///        } else if (state == NO_QUARTER) {
///            System.out.println("you need to pay first");
///        } else if (state == SOLD_OUT) {
///            System.out.println("No gumball dispense");
///        } else if (state == HAS_QUARTER) {
///            System.out.println("Np gumball dispense");
///        }
///    }

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCranK();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("释放糖果");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
