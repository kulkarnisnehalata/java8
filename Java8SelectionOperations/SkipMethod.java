package Java8SelectionOperations;

import java.util.ArrayList;
import java.util.List;

public class SkipMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Manu");
        names.add("Pinu");
        names.add("Supriya");
        names.add("Snehalata");
        names.add("Yogesh");

        names.stream().skip(4).forEach(System.out::println);
    }
}
