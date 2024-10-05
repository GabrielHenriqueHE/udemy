// Funções matemáticas


public class Aula28 {

    public static void main (String[] args) {
        double a = Math.sqrt(16);
        System.out.println(a);

        double b = Math.pow(3, 2);
        System.out.println(b);

        int c = Math.abs(-1);
        System.out.println(c);

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println(x1);
        System.out.println(x2);
    }

}
