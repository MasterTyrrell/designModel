package visitor;

public class Success implements Action {
    @Override
    public void action1(Men man) {
        man.accept(this);
    }

    @Override
    public void action2(Women women) {
        women.accept(this);
    }
}
