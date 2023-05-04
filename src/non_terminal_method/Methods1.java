package non_terminal_method;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//distinct(),limit(),reduce()
public class Methods1 {
    public static void main(String[] args) {
        List<String> vehicle = Arrays.asList("bus","ghfjfghj","car","ggg","car","bus","bus");
        //distinct
        List<String> dis_veh = vehicle.stream().distinct().collect(Collectors.toList());
        System.out.println(dis_veh);
        vehicle.stream().distinct().forEach(s-> System.out.println(s));
        //count
        long a = vehicle.stream().distinct().count();
        System.out.println(a);
        //limit
        List<String> limitedvehicle = vehicle.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited " +limitedvehicle);
        //min
        //in min it take
        List<Integer> number = Arrays.asList(12,343,10,55,66,33);
        Optional<Integer> min = number.stream().min((val1, val2)->{
                                        return val1.compareTo(val2);
        });
        System.out.println("Minimum value is "+min.get());

        Optional<Integer> max = number.stream().max((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println("Maximum value is "+max.get());

        //reduce
        List<String> string= Arrays.asList("A","1","2","G","K","56");
        Optional<String> newstr = string.stream().reduce((val,comVal)->
        {
            return val+comVal;
        });
        System.out.println("COmbined all the object "+  newstr.get());

        //ADD ELEMENT INTO AN ARRAY
        Object arr[] =string.stream().toArray();
        System.out.println(arr.length);
        for (Object v:arr)
        {
            System.out.println(v);
        }

        //sorted in ascending as well as descending
        List<String> sorting_list= Arrays.asList("Aaasd","kashid","jiva","asaci","harsh");
        List<String> new_sorting_list =sorting_list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
