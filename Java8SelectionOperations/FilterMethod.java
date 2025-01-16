package Java8SelectionOperations;

import java.util.ArrayList;
import java.util.List;

public class FilterMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Supriya");
        names.add("Manu");
        names.add("Snehalata");
        names.add("Pinu");

        names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
    }
}
