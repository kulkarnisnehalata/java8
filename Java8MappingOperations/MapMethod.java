package Java8MappingOperations;

import java.util.ArrayList;
import java.util.List;

public class MapMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Supriya");
        names.add("Manu");
        names.add("Snehalata");

        names.stream().map(String::length).forEach(System.out::println);
    }
}
