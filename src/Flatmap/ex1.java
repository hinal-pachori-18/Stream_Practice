package Flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {
        List<Integer> ls1 = Arrays.asList(12,20);
        List<Integer> ls2 = Arrays.asList(11,30);
        List<Integer> ls3 = Arrays.asList(10,40);

        List<List<Integer>> Finallis =  Arrays.asList(ls1,ls2,ls3);
        //flatmap read each and every collection like ls1,ls2,ls3 and then add into stream;
        List<Integer> finalres = Finallis.stream().flatMap(x->x.stream().map(n->n+12)).collect(Collectors.toList());
        System.out.println(finalres);
    }

}
