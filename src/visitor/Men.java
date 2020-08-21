package visitor;

public class Men implements Visitor {


    @Override
    public void accept(Action action) {
        System.out.println("men:"+action.getClass().getSimpleName());

    }
}
