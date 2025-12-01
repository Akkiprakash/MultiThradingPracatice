package StreamApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStream2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(6);
        list.add(5);
        list.add(0);
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Stream<Integer> stream1 = list.stream();
//        Stream<Integer> stream2 = stream1.sorted();
//        Stream<Integer> stream3 = stream2.map(n -> n * 2);
//        stream3.forEach(n-> System.out.println(n + " "));

//        Stream<Integer> st = list.stream()
//                .sorted();
//        st.forEach(n-> System.out.println(n));
        list.stream()
                .sorted()
                .map(n->n*2)
                .forEach(n-> System.out.print(n +" "));
        System.out.println();
        System.out.println(list);
    }
}
