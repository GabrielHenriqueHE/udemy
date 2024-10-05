package aula182;

import aula182.entities.Circle;
import aula182.entities.Rectangle;
import aula182.entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.00));
        myCircles.add(new Circle(3.00));

        System.out.println(totalArea(myCircles));

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 4.231);

        List<? extends Number> list = myInts;
        // list.add(20); - O compilador não permite a operação de inserção

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        // Number x = myNums.get(2); - O compilador não permite o acesso aos dados de acordo com
        // a atribuição do tipo

        print(myObjs);

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

        print(myInts);
        print(myDoubles);
        print(myObjs);
    }

    public static void copy (List<? extends Number> source, List<? super Number> destiny) {
        destiny.addAll(source);
    }

    public static void print(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static double totalArea(List<? extends Shape> shapes) {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.area();
        }

        return sum;
    }
}
