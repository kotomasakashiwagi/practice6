import java.util.InputMismatchException;

public class Question2 implements Question {
    @Override
    public void run() {
        System.out.println("整数　x,yを入力してください。例：3 2");
        try {
            IntPair scanIntPair = IntScanner.scanIntPair();
            int aveXY = scanIntPair.averageXY();
            IntPrinter.printInt(aveXY);
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください");
        }
    }
}
