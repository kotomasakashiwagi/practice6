import java.util.Scanner;

public class CharScanner {
    public static char scanCharX() {
        Scanner scan = new Scanner(System.in);
        return scan.next().charAt(0);
    }
}
