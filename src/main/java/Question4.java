import java.util.InputMismatchException;

public class Question4 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("正数字を入れてください");
            int scanSize = IntScanner.scanPositiveX();
            TrianglePrinter.printTriangle(scanSize);
            System.out.println("サイズ２，３，４の三角形を生成します。");
            TrianglePrinter.printTriangle(3);
            TrianglePrinter.printTriangle(4);
            TrianglePrinter.printTriangle(5);
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
