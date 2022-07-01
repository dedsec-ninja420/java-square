public class Square {
    public double sideA;
    public double sideB;
    public double sideC;
    public double sideD;

    public Square(double a) {
        sideA = a;
        sideB = a;
        sideC = a;
        sideD = a;
    }

    public double getPerimeter() {
        return sideA * 4;
    }

    public double getArea() {
        return Math.pow(sideA, 2);
    }

    public double getDiagonal() {
        return sideA * Math.sqrt(2);
    }
}
