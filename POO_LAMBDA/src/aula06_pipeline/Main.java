package aula06_pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,3,1,5,6,7,8,9,10);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));


        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Soma: " + sum);
    }
}
