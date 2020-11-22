import java.util.List;
import java.util.stream.IntStream;

public class ListPrinter {
    public static void printKuKuTable() {
        IntStream.range(1, 10).mapToObj(Calculator::createKuKuStep).forEach(kuKuStep -> {
            printKuKuStepList(kuKuStep);
            System.out.print("\n");
        });
    }

    public static void printKuKuStepList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.printf(" %2d", integer);
        }
    }

    public static void printPartsOfIntList(List<Integer> list, int start, int end) {
        IntStream.range(start - 2, end - 2).mapToObj(i -> list.get(i) + " ").forEach(System.out::print);
    }
}
