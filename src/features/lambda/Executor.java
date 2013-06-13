package features.lambda;


public class Executor {

    public void execute(Action action){
        action.run("Hello");
    }

    public static void main(String[] args) {
        new Executor().execute((String s) -> System.out.print(s));
        new Executor().execute(s -> System.out.print(s));
        new Executor().execute(System.out::print);
    }
}
