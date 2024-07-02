package exercicio01;

public class Rectangle {

    private double width, height;

    public Rectangle (double width, double height) {

        this.width = width;
        this.height = height;

    }

    public double getArea() {

        return this.width * this.height;

    }

    public double getPerimeter() {

        return (this.width * 2) + (this.height * 2);

    }

    public double getDiagonal() {

        double diagonal = Math.sqrt(
                Math.pow(this.width, 2) +
                Math.pow(this.height, 2)
        );

        return diagonal;

    }

}
