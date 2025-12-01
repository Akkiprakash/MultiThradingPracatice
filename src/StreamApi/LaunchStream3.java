package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
collects is used for the collection to trabsfer the data into the seperate dat type to the streams
 */
public class LaunchStream3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(6);
        list.add(5);
        list.add(0);
        System.out.println(list);

        List<Integer> list1 = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
