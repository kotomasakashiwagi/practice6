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

    public static List<Integer> addToList(int element, List<Integer> list) {
        list.add(element);
        return list;
    }
}