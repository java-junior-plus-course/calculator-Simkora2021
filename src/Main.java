import java.util.Scanner;

public class Main {
    public double self() {
        Scanner sc = new Scanner(System.in);
        double i = 0;
        if (sc.hasNextDouble()) {
            i = sc.nextDouble();
        } else {
            System.out.println(" neverno vvedeno ");
        }
        return i;
    }
}