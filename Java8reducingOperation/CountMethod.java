package Java8reducingOperation;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Supriya");
        names.add("Manu");
        names.add("Snehalata");

       // long noOfBigNames = names.stream().filter((String name) -> name.length() > 5).count();

        long noOfBigNames = names.stream().count();

        System.out.println(noOfBigNames);
    }
}
