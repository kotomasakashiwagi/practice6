import java.util.List;

public class UtilityOfList {
    public static int calculateMaxInList(List<Integer> originalList) {
        int startElement = originalList.get(0);
        for (int key : originalList) {
            if (startElement < key) {
                startElement = key;
            }
        }
        return startElement;
    }
}