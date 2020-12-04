public class RubToDollars implements In {
    private static double rubToDollars = 234;
    private static double dollarsToRub = 15;

    public static double getRubToDollars() {
        return rubToDollars;
    }

    public static void setRubToDollars(double rubToDollars) {
        RubToDollars.rubToDollars = rubToDollars;
    }

    public static double getDollarsToRub() {
        return dollarsToRub;
    }

    public static void setDollarsToRub(double dollarsToRub) {
        RubToDollars.dollarsToRub = dollarsToRub;
    }

    public static void main(String[] args) {
        double dollars;
        double rub;



        SquareRoots squareRoots = new SquareRoots();
        dollars = rubToDollars / COEFFICIENT;
        rub = dollarsToRub * COEFFICIENT;

        System.out.println(rubToDollars+" рублей в долларах равно "+ dollars+ " долларов");
        System.out.println(dollarsToRub+" долларов в рублях равно "+ rub+ " рублей");
    }

    @Override
    public void multiply() {

    }
    @Override
    public void division() {

    }
}
