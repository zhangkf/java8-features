package features.defaultmethod;

public class ClazzA implements A{
    @Override
    public void a() {

    }

    @Override
    public void foo() {
        System.out.println("Calling ClazzA.foo()...");
    }

    public static void main(String[] args) {
        A a = new ClazzA();
        a.foo();

        ClazzA clazzA = new ClazzA();
        clazzA.foo();
    }
}
