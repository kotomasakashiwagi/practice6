import java.util.InputMismatchException;

public class Question5 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("正数字を１つ入力してください。");
            int scanSize = IntScanner.scanPositiveX();
            System.out.println("文字を１つ入力してください。");
            char scanChar = CharScanner.scanCharX();
            String triangleElement = String.valueOf(scanChar);
            TrianglePrinter.printTriangle(scanSize, triangleElement);
            System.out.println("サイズと文字の違う三角形を３つ生成します。");
            TrianglePrinter.printTriangle(5, "'");
            TrianglePrinter.printTriangle(1, "@");
            TrianglePrinter.printTriangle(30, "w");
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
