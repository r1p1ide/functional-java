package flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>> listOfListsOfInteger = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);

        list2.add(2);
        list2.add(4);
        list2.add(6);

        listOfListsOfInteger.add(list1);
        listOfListsOfInteger.add(list2);

        listOfListsOfInteger.stream()
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
