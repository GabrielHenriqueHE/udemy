package problemaTriangulo;

public class Triangle {

    double a, b, c;

    public Triangle (double a, double b, double c)  {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calcP () {
        return (this.a + this.b + this.c) / 2;
    }

    public double calcArea () {
        double P;
        P = calcP();
        return Math.sqrt(P * (P-this.a) * (P-this.b) * (P-this.c));
    }
}