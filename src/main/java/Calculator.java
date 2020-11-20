import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Calculator {
    public static int calculateDual(int OriginalNumber) {
        return OriginalNumber * OriginalNumber;
    }

    public static List<Integer> createKuKuStep(int naturalNumber) {
        List<Integer> kuKuStep = IntStream.range(1, 10).mapToObj(i -> i * naturalNumber).collect(Collectors.toList());
        return kuKuStep;
    }

}
