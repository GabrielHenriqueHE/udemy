package exercicio03;

public class Student {

    public String name;
    private double n1, n2, n3;

    public Student (String name) {
        this.name = name;
    }

    public void setN1(double n1) {
        try {
            if (n1 > 0 && n1 <= 30) {
                this.n1 = n1;
            } else {
                throw new ArithmeticException("Valor não pode ser menor que 0 ou maior que 30.");
            }
        } catch (ArithmeticException e) {
            System.exit(1);
        }
    }

    public void setN2(double n2) {
        try {
            if (n2 > 0 && n2 <= 35) {
                this.n2 = n2;
            } else {
                throw new ArithmeticException("Valor não pode ser menor que 0 ou maior que 30.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setN3(double n3) {
        try {
            if (n3 > 0 && n3 <= 35) {
                this.n3 = n3;
            } else {
                throw new ArithmeticException("Valor não pode ser menor que 0 ou maior que 35.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public double calcularNota () {
        return this.n1 + this.n2 + this.n3;
    }

}
