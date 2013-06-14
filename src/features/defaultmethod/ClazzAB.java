package features.defaultmethod;

public class ClazzAB implements A, B{
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void foo() {
        A.super.foo();
    }

    public static void main(String[] args) {

        B clazzAB = new ClazzAB();
        clazzAB.foo();

    }
}
