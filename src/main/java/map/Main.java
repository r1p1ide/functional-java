package map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        integerList.add(9);
        integerList.add(11);


        integerList.stream()
                .map(e -> e * e)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
