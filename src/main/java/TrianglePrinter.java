import java.util.stream.IntStream;

public class TrianglePrinter {
    public static void printTriangle(int size, String element) {
        IntStream.rangeClosed(1, size).forEach(i -> StringPrinter.printStringANumberOfTimes(element, i));
    }

    public static void printTriangle(int size) {
        printTriangle(size, "$");
    }

}
