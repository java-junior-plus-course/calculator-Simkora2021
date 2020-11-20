public class RunCalculator {
    public static void main(String[] args){
        Main main = new Main();
        double one;
        double two;
        int action;
        do {
            System.out.println("Write first number");
            one = main.self();
            System.out.println("Write second number");
            two = main.self();

            Calculator calc = new Calculator(one, two);
            System.out.println("Check action");
            System.out.println("1. add");
            System.out.println("2. subs");
            System.out.println("3. multi");
            System.out.println("4. div");
            System.out.println("5. mod");
            System.out.println("0. Exit");
            action = (int) main.self();
            switch (action) {
                case 1:
                    System.out.println(calc.add());
                    break;
                case 2:
                    System.out.println(calc.subs());
                    break;
                case 3:
                    System.out.println(calc.multi());
                    break;
                case 4:
                    System.out.println(calc.div());
                    break;
                case 5:
                    System.out.println(calc.mod());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("LOX");
            }
        } while (action != 0);
    }
}
