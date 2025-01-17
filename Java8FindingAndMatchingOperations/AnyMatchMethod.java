package Java8FindingAndMatchingOperations;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchMethod {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Sneha");
        names.add("Manoj");

        if (names.stream().anyMatch((String name) -> name.length() == 5));
        {
            System.out.println("Yes__There is a name exist with 5 letters");
        }




    }
}
