package status;

public class GumballMachine {

    private Status havingQuarterStatus;
    private Status noQuarterStatus;
    private Status soldOutStatus;
    private Status soldStatus;

    private int count=0;
    private Status now;

    public GumballMachine(int count){
        this.count = count;
        this.havingQuarterStatus = new HavingQuarterStatus();
        this.noQuarterStatus = new NoQuarterStatus();
        this.soldOutStatus = new SoldOutStatus();
        this.soldStatus = new SoldOutStatus();
        if (this.count>0){
            this.now = this.noQuarterStatus;
        }
        this.now = this.soldOutStatus;
    }

    public void insertQuarter() {
        this.now.insertQuarter();
    }

    public void ejectQuarter() {
        this.now.ejectQuarter();
    }

    public void turnCrank() {
        this.now.turnCrank();
    }

    public void dispense() {
        this.dispense();
    }
}
