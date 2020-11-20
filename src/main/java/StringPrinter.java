import java.util.stream.IntStream;

public class StringPrinter {
    public static void printStringANumberOfTimes(String keyWord, int count) {
        IntStream.range(0, count).mapToObj(i -> keyWord + " ").forEach(System.out::print);
        System.out.print("\n");
    }
}
