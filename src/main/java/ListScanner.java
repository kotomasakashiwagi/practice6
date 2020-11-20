import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListScanner {
    public static List<Integer> scanIntList(int size) {
        List<Integer> scannedList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            int scannedInt = scan.nextInt();
            scannedList.add(scannedInt);
        }
        return scannedList;
    }
}
