package Java8reducingOperation;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonu");
        names.add("Supriya");
        names.add("Manu");
        names.add("Snehalata");

        List<String> first3Names = names.stream().limit(3).collect(Collectors.toList());
        System.out.println(first3Names);
    }
}
