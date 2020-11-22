public class Question7 implements Question {
    private static final int MIN = 10000;
    private static final int MAX = 10100;

    @Override
    public void run() {
        IntPrinter.printPrimeNumber(MIN, MAX);
    }
}
