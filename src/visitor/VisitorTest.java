package visitor;

public class VisitorTest {

    public static void main(String[] args) {
        Men man = new Men();
        Women women = new Women();
        Success success = new Success();
        success.action1(man);
        success.action2(women);
        Failure failure = new Failure();
        failure.action1(man);
        failure.action2(women);
    }
}
