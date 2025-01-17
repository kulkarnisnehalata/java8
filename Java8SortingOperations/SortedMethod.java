package Java8SortingOperations;

import java.util.ArrayList;
import java.util.List;

public class SortedMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Manu");
        names.add("Supriya");
        names.add("Snehalata");

        names.stream().sorted().forEach(System.out::println);
    }
}
