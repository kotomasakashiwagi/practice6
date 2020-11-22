import java.util.Scanner;

public class IntScanner {
    public static int scanIntX() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static IntPair scanIntPair() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        return new IntPair(x, y);
    }

    public static int scanPositiveX() {
        int scanX = scanIntX();
        if (scanX < 0) {
            throw new IllegalArgumentException("正数字を入れてください");
        }
        return scanX;
    }

    public static int scanOneToNine() {
        int scanX = scanIntX();
        if (scanX < 1 || scanX > 9) {
            throw new IllegalArgumentException("正数字を入れてください");
        }
        return scanX;
    }
}
