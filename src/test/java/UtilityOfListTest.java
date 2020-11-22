import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityOfListTest {
    @Test
    public void calculateMaxInList() {
        List<Integer> testList = new ArrayList<>();
        testList.add(2);
        testList.add(3);
        testList.add(-4);
        testList.add(5);
        testList.add(5);
        testList.add(-6);
        assertEquals(5, UtilityOfList.calculateMaxInList(testList));
    }

    @Test
    public void addToList() {
        List<Integer> testList = new ArrayList<>();
        UtilityOfList.addToList(10, testList);
        UtilityOfList.addToList(100, testList);
        UtilityOfList.addToList(1000, testList);
        UtilityOfList.addToList(0, testList);
        assertEquals(10, testList.get(0));
        assertEquals(1000, testList.get(2));
        assertEquals(4, testList.size());
    }
}