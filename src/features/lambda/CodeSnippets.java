package features.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CodeSnippets {

    public void sample1(){

        Runnable r = () -> System.out.print("Hello lambda.");

        Comparator<Integer> cmp = (x, y) -> (x < y) ? -1 : ((x > y) ? 1 : 0);


        Comparator<Integer> cmp2 = (x, y) -> {
            return (x < y) ? -1 : ((x > y) ? 1 : 0);
        };

    }


    public void sample2(){
        List<Integer> integers = new ArrayList<Integer>(){};
        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers.forEach(System.out::println);

    }

    public static void main(String[] args) {
        new CodeSnippets().sample2();
    }
}
