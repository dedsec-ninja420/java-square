// creare classe quadrato che calcola perimetro e area

public class SquareProgram {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        System.out.println("Il perimetro del quadrato è uguale a " + s1.getPerimeter() + ", la sua area è uguale a "
                + s1.getArea() + " e la sua diagonale è uguale a " + s1.getDiagonal());
    }
}
