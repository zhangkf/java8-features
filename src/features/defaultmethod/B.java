package features.defaultmethod;

public interface B {
    void b();

    default void foo(){
        System.out.println("Calling B.foo()...");
    }

}
