package visitor;

public class Women implements Visitor {
    @Override
    public void accept(Action action) {
        System.out.println("Women:"+action.getClass().getSimpleName());
    }
}
