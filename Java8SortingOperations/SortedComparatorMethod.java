package Java8SortingOperations;

import java.util.ArrayList;
import java.util.List;

public class SortedComparatorMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Supriya");
        names.add("Sonu");
        names.add("Snehalata");
        names.add("Manoj");

        names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);
    }
}
