package aula05_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,3,1,5,6,7,8,9,10);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Ana", "Maria", "Malu", "Pedro");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 1).limit(10);
        System.out.println(Arrays.toString(st3.toArray()));

        Stream<Integer> fibonacci = Stream.iterate(new Long[]{0L, 1L}, x -> new Long[]{x[1], x[0] + x[1]})
                .map(x -> x[0].intValue());

        System.out.println(Arrays.toString(fibonacci.limit(30).toArray()));
    }
}
