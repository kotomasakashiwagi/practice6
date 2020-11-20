import java.util.InputMismatchException;
import java.util.List;

public class Question6 implements Question{
    @Override
    public void run(){
        try {
            System.out.println("正数字を１つ入力してください。");
            int scanInt = IntScanner.scanOneToNine();
            List<Integer> kuKuStep = Calculator.createKuKuStep(scanInt);
            ListPrinter.printIntList(kuKuStep);
            System.out.println("\n九九表を表示します。");
            ListPrinter.printKuKuTable();
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
