package problemaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

       Locale.setDefault(Locale.US);

       Scanner sc = new Scanner(System.in);

       System.out.println("Insira as medidas do primeiro triângulo (A, B, C): ");
       Triangle t1 = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

       System.out.println("Insira as medidas do segundo triângulo (A, B, C): ");
       Triangle t2 = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

       double areaT1 = t1.calcArea();
       double areaT2 = t2.calcArea();

       System.out.printf("Área T1 = %.4f\nÁrea T2 = %.4f\n", areaT1, areaT2);

       if (areaT1 > areaT2) {
           System.out.printf("T1 tem a maior área: %.4f", areaT1);
       } else if (areaT1 < areaT2) {
           System.out.printf("T1 tem a maior área: %.4f", areaT2);
       } else {
           System.out.printf("Os dois tem áreas iguais: %.4f", areaT1);
       }

    }

}
