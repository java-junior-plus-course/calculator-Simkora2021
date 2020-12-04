abstract class AbstractTranslate {
    void writeRub(){
        System.out.println("вводим рубли");
    }
    void writeDol(){
        System.out.println("вводим доллары");
    }
    void simple(){
        System.out.println("выполняем перевод");
    }

    abstract void startCycle();
}
