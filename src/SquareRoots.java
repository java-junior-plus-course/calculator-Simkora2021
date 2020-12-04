public class SquareRoots extends RunCalculator {

    private static double squareOne = 10;
    private static double squareTwo = 321;
    private static double squareThree = 341;
    private static double squareFour = 234;

    public double getSquareOne() {
        return squareOne;
    }

    public void setSquareOne(double squareOne) {
        this.squareOne = squareOne;
    }

    public double getSquareTwo() {
        return squareTwo;
    }

    public void setSquareTwo(double squareTwo) {
        this.squareTwo = squareTwo;
    }

    public double getSquareThree() {
        return squareThree;
    }

    public void setSquareThree(double squareThree) {
        this.squareThree = squareThree;
    }

    public double getSquareFour() {
        return squareFour;
    }

    public void setSquareFour(double squareFour) {
        this.squareFour = squareFour;
    }

    public static void main(String[] args) {



            System.out.printf("Корень квадратный из (%.3f) = %.3f%n", squareOne, Math.sqrt(squareOne));
            System.out.printf("Корень квадратный из (%.3f) = %.3f%n", squareTwo, Math.sqrt(squareTwo));
            System.out.printf("Корень квадратный из (%.3f) = %.3f%n", squareThree, Math.sqrt(squareThree));
            System.out.printf("Корень квадратный из (%.3f) = %.3f%n", squareFour, Math.sqrt(squareFour));
        }

    }

