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
}
