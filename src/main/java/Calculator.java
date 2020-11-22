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

    public static boolean isPrimeNumber(int naturalNumber) {
        if (naturalNumber % 2 == 0) {
            return false;
        } else {
            int sqrtN = (int) Math.sqrt(naturalNumber);
            for (int i = 2; i < sqrtN; i++) {
                if (naturalNumber % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void fibonacciRecurrenceFormula(int an, int anPlus1, int targetOrder,
                                                  List<Integer> fibonacciList, int count) {
        int sum = an + anPlus1;
        if (count < targetOrder) {
            UtilityOfList.addToList(sum, fibonacciList);
            count++;
            fibonacciRecurrenceFormula(anPlus1, sum, targetOrder, fibonacciList, count);
        }
    }


}
