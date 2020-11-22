import java.util.ArrayList;
import java.util.List;

public class Question8 implements Question {
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private static final int START = 11;
    private static final int END = 20;
    private static final int COUNT = 2;

    @Override
    public void run() {
        List<Integer> fibonacci = new ArrayList<>();
        Calculator.fibonacciRecurrenceFormula(FIRST, SECOND, END, fibonacci, COUNT);
        ListPrinter.printPartsOfIntList(fibonacci, START, END);
    }
}
