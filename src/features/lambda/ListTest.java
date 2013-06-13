package features.lambda;

import java.util.Arrays;
import java.util.List;

interface ListVisitor<E> {
    void visit(E element, int index);
}

public class ListTest {

    public void visitList(List list, ListVisitor visitor) {
        for (int i = 0; i < list.size(); i++) {
            visitor.visit(list.get(i), i);

        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("a", "b", "c");

        new ListTest().visitList(list, (s, index) -> System.out.println(index + " - " + s));


    }


}
