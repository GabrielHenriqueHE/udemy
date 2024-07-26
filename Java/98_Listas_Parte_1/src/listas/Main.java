package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Lucas");
        list.add("Gabriel");
        list.add("Maria");
        list.add("Julia");
        list.add("Alan");
        list.add(2, "Gustavo");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String name : list) {
            System.out.println(name);
        }

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
