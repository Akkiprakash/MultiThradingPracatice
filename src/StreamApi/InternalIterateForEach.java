package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 this is the stream api which is used in the iteration loops for each
 it contains two ineranl and the external looping

 */
public class InternalIterateForEach {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
//        System.out.println(list);
//        for (int i : list){
//            System.out.println(i);
//        }
        ///  using the inernal loop  with the help of the Cosumer Interface which implemts closable also

        // using the interanll application
//        Consumer<Integer> c = new Consumer<>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println("this is the consumer block");
//            }
//        };
      //  list.forEach(n-> System.out.println(c));
        list.forEach((n)-> System.out.println(n));
    }
}
