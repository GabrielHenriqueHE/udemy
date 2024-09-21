package aula184;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("TV");
        hashSet.add("Tablet");
        hashSet.add("Notebook");

        copy(hashSet, treeSet);
        copy(hashSet, linkedHashSet);

        System.out.println(hashSet.contains("Notebook"));

        for (String p : hashSet) {
            System.out.println(p);
        }
        System.out.println();

        for (String p : treeSet) {
            System.out.println(p);
        }
        System.out.println();

        for (String p : linkedHashSet) {
            System.out.println(p);
        }
        System.out.println();

        hashSet.removeIf(x -> x.length() >= 3);

        for (String p : hashSet) {
            System.out.println(p);
        }
        System.out.println();

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);


    }

    public static void copy (Set<? extends String> source, Set<? super String> destiny) {
        destiny.addAll(source);
    }
}
