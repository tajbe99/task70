package task70;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class task70Test {
    private static task70 test = new task70();

    @Test
    public void writeDataToFile() {
        test.writeDataToFile("fmospd");
    }

    @Test
    public void readDataFromFile() throws IOException {
        ArrayList<String> someList = test.readDataFromFile();
    }

    @Test
    public void calculating() {
        ArrayList<String> someList = new ArrayList<>();
        someList.add("gsdsfg");
        someList.add("-2");
        test.calculating(someList);
    }
}