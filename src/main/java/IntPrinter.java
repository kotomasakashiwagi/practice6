import java.util.stream.IntStream;

public class IntPrinter {
    public static void printInt(int i) {
        System.out.println(i);
    }

    public static void printPrimeNumber(int min, int max) {
        IntStream.rangeClosed(min, max).filter(Calculator::isPrimeNumber).forEach(IntPrinter::printInt);
    }
}
