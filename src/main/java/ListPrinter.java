import java.util.List;
import java.util.stream.IntStream;

public class ListPrinter {
    public static void printKuKuTable() {
        IntStream.range(1, 10).mapToObj(Calculator::createKuKuStep).forEach(kuKuStep -> {
            printIntList(kuKuStep);
            System.out.print("\n");
        });
    }

    public static void printIntList(List<Integer> list) {
        for (Integer integer : list) {
            //System.out.print(integer + " ");
            System.out.printf(" %2d", integer);
        }
    }
}
