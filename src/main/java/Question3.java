import java.util.InputMismatchException;
import java.util.List;

public class Question3 implements Question{
    @Override
    public void run(){
        try {
            System.out.println("整数を2つ入力してください。例　2 3");
            List<Integer> scan2SizeList = ListScanner.scanIntList(2);
            int maxIn2SizeList = UtilityOfList.calculateMaxInList(scan2SizeList);
            IntPrinter.printInt(maxIn2SizeList);
            System.out.println("整数を3つ入力してください。例　2 3 4");
            List<Integer> scan3SizeList = ListScanner.scanIntList(3);
            int maxIn3SizeList = UtilityOfList.calculateMaxInList(scan3SizeList);
            IntPrinter.printInt(maxIn3SizeList);
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください");
        }
    }
}
