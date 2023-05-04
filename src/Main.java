import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      // 3 ways to create a list
        //first way by using of method it is immutable type we cannot add some values.
        List<Integer> list1 = List.of(32,12,3,11,55,44);
//        list1.add(21);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(11);
        list2.add(15);
        list2.add(16);
        System.out.println(list2);

        //3rd  way to create list
        List<Integer> list3 = Arrays.asList(12,32,44);
        System.out.println(list3);
        //list1
        //WIthout Stream
//        List <Integer> Listeven = new ArrayList<>();
//        for (Integer i : list1){
//            if(i%2 == 0){
//                Listeven.add(i);
//
//            }
//        }
//        System.out.println(Listeven);
        //With STream
        List<Integer>newlist =  list1.stream().filter(i->i%2 == 0).collect(Collectors.toList());
        System.out.println("Print EVen number of list" +newlist);

       List<Integer>newlist2 =  list1.stream().filter(i->i>30).collect(Collectors.toList());
        System.out.println("Print value greater than 30"+newlist2);

        //obtain a stream from an array
        int a[] = {2,4,77,11,33};
            Stream.of(a);
        //Obtain a stream of particulare index
        int[] arrayOfEmps ={1,2,3};
        Stream.of(arrayOfEmps[0]);

        List<String> str = Arrays.asList("HInal","jayeshhh","kiskko","mesho","flipkart");
        str.stream().filter(s->s.length() >5 && s.length()<8).forEach(s-> System.out.println(s));
        str.stream().filter(s->s.length() >6 && s.length()<8).forEach(System.out::println);

    }
}