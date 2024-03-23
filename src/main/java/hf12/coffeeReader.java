package hf12;
import java.util.*;
import java.util.stream.*;
public class coffeeReader {
    public static void main(String[] args) {

        List<String> coffees = List.of("cappuccino", "Americano", "Espresso", "Cortado", "Mocha", "Latte");
        List<String> coffeesEndingInO = coffees.stream()
                .filter(s -> s.endsWith("O"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(coffeesEndingInO);


    }
}



