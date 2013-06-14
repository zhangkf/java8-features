package features.defaultmethod;

public interface A {
    void a();

    default void foo(){
        System.out.println("Calling A.foo()...");
    }
}
