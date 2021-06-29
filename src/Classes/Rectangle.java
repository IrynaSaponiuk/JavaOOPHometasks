package Classes;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double getSideA() {
        return sideA;
    }


    public double getSideB() {
        return sideB;
    }


    public double area() {
        return sideA * sideB;
    }


    public double perimeter() {
        return (sideA + sideB) * 2;
    }


    public boolean isSquare() {
        if (sideA == sideB) {
            return true;
        } else {
            return false;
        }
    }


    public void replaceSides() {
        double tmp;
        tmp = sideA;
        sideA = sideB;
        sideB = tmp;
    }

}
