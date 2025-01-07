package compartor;

import lista.Produto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Com {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,7,8,10);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("MARIA", "ALEX", "BOBO");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(100).toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10000).toArray()));

        String txt = "fabada,silva,santos";
        Scanner sc = new Scanner(txt);
        

    }
}
