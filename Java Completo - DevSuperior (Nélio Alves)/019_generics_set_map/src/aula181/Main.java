package aula181;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* List<Object> myObjs = new ArrayList<>();
        List<Integer> myInts = new ArrayList<>();

        myObjs = myInts; */

        List<?> myObjs = new ArrayList<>();
        List<Integer> myInts = new ArrayList<>();

        myObjs = myInts;
    }

    public static void printList(List<?> list) {
        // list.add(3);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
