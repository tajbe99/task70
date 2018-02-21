package task70;

import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;

public class task70Test {
    private static task70 test = new task70();

    @Test
    public void writeDataToFile() {
        test.writeDataToFile("fmospd");
    }

    @Test
    public void readDataFromFile() throws IOException {
        ArrayList<String> someList = test.readDataFromFile("C:\\task70\\task70\\input.txt");
        Assert.assertNotNull(someList);
    }

    @Test
    public void calculating() {
        ArrayList<String> someList = new ArrayList<>();
        someList.add("gsdsfg");
        someList.add("-2");
        test.calculating(someList);
    }
}
