package Java8SelectionOperations;

import java.util.ArrayList;
import java.util.List;

public class DistinctMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Manu");
        names.add("Sonu");
        names.add("Manu");
        names.add("pinu");

        names.stream().distinct().forEach(System.out::println);
    }
}
