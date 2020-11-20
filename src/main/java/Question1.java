import java.util.InputMismatchException;

public class Question1 implements Question {
    @Override
    public void run() {
        System.out.println("整数xを入力してください。例：2");
        try {
            int scanIntX = IntScanner.scanIntX();
            int DualX = Calculator.calculateDual(scanIntX);
            IntPrinter.printInt(DualX);
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください");
        }
    }
}
